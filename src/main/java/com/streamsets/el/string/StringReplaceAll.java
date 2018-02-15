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
 * StringReplaceAll.java - Streamsets expression language function for java string replaceAll method
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class StringReplaceAll {

    /**
     *
     * @param inString The original string
     * @param regex The regex to look for
     * @param replacement The string to replace every occurence of the regex with
     * @return String The string after the concatenation
     */
    @ElFunction(
            prefix = "string",
            name = "replaceAll",
            description = "Returns a modified string"
    )
    public static String replaceAll(
            @ElParam("inString") String inString, @ElParam("regex") String regex, @ElParam("replacement") String replacement
    ) {
        try {
                return inString.replaceAll(regex, replacement);
        } catch (Exception e) {
            return "***string:replaceallerror***";
        }
    }
}
