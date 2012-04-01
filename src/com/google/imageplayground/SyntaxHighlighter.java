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

package com.google.imageplayground;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.imageplayground.codegen.DexImageScript;

import android.graphics.Color;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;

public class SyntaxHighlighter {

    // Could query parser/codegen classes rather than duplicating strings here
    static Collection<String> KEYWORDS = Arrays.asList("if", "while", "for", "return");
    static Collection<String> DEFAULT_VARS = Arrays.asList("y", "r", "g", "b", "row", "col", "width", "height");
    static Method[] scriptMethods = DexImageScript.class.getDeclaredMethods();
    
    static Pattern WORD_PATTERN = Pattern.compile("\\w+");
    
    int keywordColor = Color.argb(255, 160, 20, 160);
    int defaultVarColor = Color.argb(255, 0, 0, 255);
    int functionColor = Color.argb(255, 255, 80, 0);

    public void applySyntaxHighlighting(Spannable spannable) {
        // remove foreground spans, there may be existing spans that we don't want to remove
        for(ForegroundColorSpan span : spannable.getSpans(0,  spannable.length(), ForegroundColorSpan.class)) {
            spannable.removeSpan(span);
        }
        
        Matcher matcher = WORD_PATTERN.matcher(spannable);
        while (matcher.find()) {
            Integer color = null;
            String match = matcher.group();
            if (KEYWORDS.contains(match)) {
                color = keywordColor;
            }
            else if (DEFAULT_VARS.contains(match)) {
                color = defaultVarColor;
            }
            else if (isScriptFunction(match)) {
                color = functionColor;
            }
            
            if (color!=null) {
                spannable.setSpan(new ForegroundColorSpan(color), matcher.start(), matcher.end(), 0);
            }
        }
    }
    
    boolean isScriptFunction(String str) {
        String target = "script_" + str;
        for(Method m : scriptMethods) {
            if (m.getName().equals(target)) return true;
        }
        return false;
    }

}
