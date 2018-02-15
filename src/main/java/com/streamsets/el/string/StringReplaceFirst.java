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

package com.streamsets.el.string;

import com.streamsets.pipeline.api.ElDef;
import com.streamsets.pipeline.api.ElFunction;
import com.streamsets.pipeline.api.ElParam;

/**
 * StringReplaceFirst.java - Streamsets expression language function for java string replaceFirst method
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class StringReplaceFirst {

    /**
     *
     * @param inString The original string
     * @param regex The regex to look for
     * @param replacement The string to replace the first occurence of the regex with
     * @return String The string after the concatenation
     */
    @ElFunction(
            prefix = "string",
            name = "replaceFirst",
            description = "Returns a modified string"
    )
    public static String replaceFirst(
            @ElParam("inString") String inString, @ElParam("regex") String regex, @ElParam("replacement") String replacement
    ) {
        try {
                return inString.replaceFirst(regex, replacement);
        } catch (Exception e) {
            return "***string:replacefirst error***";
        }
    }
}
