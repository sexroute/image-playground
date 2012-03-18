/* 
 * Copyright 2012 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.imageplayground.codegen;

import java.util.Arrays;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import com.google.dexmaker.BinaryOp;

import junit.framework.TestCase;

public class DexCodeGeneratorTest extends TestCase {
	
	private static void verifyTreesEqual(Tree tree1, Tree tree2) {
		assertEquals(tree1.getText(), tree2.getText());
		int numChildren = tree1.getChildCount();
		assertEquals(numChildren, tree2.getChildCount());
		for(int i=0; i<numChildren; i++) {
			verifyTreesEqual(tree1.getChild(i), tree2.getChild(i));
		}
	}
	
	private static Tree createTree(String content) {
		Token token = new CommonToken(0, content);
		return new CommonTree(token);
	}
	
	private static Tree createTreeWithChildren(String parentContent, String...childContent) {
		Tree parent = createTree(parentContent);
		for(String s : childContent) {
			Tree child = createTree(s);
			parent.addChild(child);
		}
		return parent;
	}
	
	public void testParse() throws Exception {
		String exp = "x = 1";
		Tree expectedTree = createTreeWithChildren("=", "x", "1");
		verifyTreesEqual(DexCodeGenerator.createParseTree(exp), expectedTree);
	}
	
	private void verifyScriptInstructions(String script, DexCodeGenerator.Instruction... expectedInstructions) throws Exception {
		DexCodeGenerator.InstructionContext context = DexCodeGenerator.createInstructionList(script);
		assertEquals(Arrays.asList(expectedInstructions), context.instructions);
	}
	
	public void testConstantAssignment() throws Exception {
		verifyScriptInstructions("x = 1",
			new DexCodeGenerator.ConstantIntAssignment("x", 1));
	}
	
	public void testVariableAssignment() throws Exception {
		verifyScriptInstructions("x = y",
			new DexCodeGenerator.IntAssignment("x", "y"));
	}
	
	public void testSumExpression() throws Exception {
		verifyScriptInstructions("x = y+1",
			new DexCodeGenerator.ConstantIntAssignment("!1", 1),
			new DexCodeGenerator.BinaryIntOperation("x", BinaryOp.ADD, "y", "!1"));
	}
	
	public void testSumOfProductsExpression() throws Exception {
		verifyScriptInstructions("z = a + b * 2",
			new DexCodeGenerator.ConstantIntAssignment("!1", 2),
			new DexCodeGenerator.BinaryIntOperation("!2", BinaryOp.MULTIPLY, "b", "!1"),
			new DexCodeGenerator.BinaryIntOperation("z", BinaryOp.ADD, "a", "!2"));
	}
	
	public void testParenthesizedExpression() throws Exception {
		verifyScriptInstructions("z = (a + 3) * b",
			new DexCodeGenerator.ConstantIntAssignment("!1", 3),
			new DexCodeGenerator.BinaryIntOperation("!2", BinaryOp.ADD, "a", "!1"),
			new DexCodeGenerator.BinaryIntOperation("z", BinaryOp.MULTIPLY, "!2", "b"));
	}

}
