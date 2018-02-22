/*
 * Copyright 2018 Michael Fox
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

package com.streamsets.el.regex;

import com.streamsets.pipeline.api.ElDef;
import com.streamsets.pipeline.api.ElFunction;
import com.streamsets.pipeline.api.ElParam;

import java.util.regex.Pattern;

/**
 * RegexReplaceFirst.java - Streamsets expression language function for java regex replaceFirst method
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class RegexReplaceFirst {

    /**
     *
     * @param inString The original text
     * @param regex The expression to match on
     * @param replacement The text to replace matches with
     * @return String The string with first match replaced
     */
    @ElFunction(
            prefix = "regex",
            name = "replaceFirst",
            description = "Returns the string with the first match replaced"
    )
    public static String replaceFirst(
            @ElParam("inString") String inString, @ElParam("regex") String regex, @ElParam("replacement") String replacement
    ) {
        try {
            return Pattern.compile(regex).matcher(inString).replaceFirst(replacement);
        } catch (Exception e) {
            return inString;
        }
    }
}
