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
 * StringReplace.java - Streamsets expression language function for java string replace method
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class StringReplace {

    /**
     *
     * @param inString The original string
     * @param oldString The string to replace
     * @param newString The string to switch to
     * @return String The string after the replacement
     */
    @ElFunction(
            prefix = "string",
            name = "replace",
            description = "Returns a string after a replacement"
    )
    public static String replace(
            @ElParam("inString") String inString, @ElParam("oldString") String oldString, @ElParam("newString") String newString
    ) {
        try {
                return inString.replace(oldString, newString);
        } catch (Exception e) {
            return "***string:replace error***";
        }
    }
}
