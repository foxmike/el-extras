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
 * @version 1.0
 */

@ElDef
public class StringReplaceList {

    /**
     *
     * @param inString The original string
     * @param oldList pipe delimited list of strings to replace
     * @param newList pipe delimited list of strings to switch to
     * @return String The string after the replacement
     */
    @ElFunction(
            prefix = "string",
            name = "replaceList",
            description = "Returns a string after multiple replacements attempted"
    )
    public static String replace(
            @ElParam("inString") String inString, @ElParam("oldList") String oldList, @ElParam("newlist") String newList
    ) {
        try {
                String oldStrings[] = oldList.split("\\|");
                String newStrings[] = newList.split("\\|");
                if (oldStrings.length != newStrings.length) return "***string:replaceList error - list lengths do not match";
                for (int x = 0; x < oldStrings.length; x++) {
                    inString = inString.replace(oldStrings[x], newStrings[x]);
                }
                return inString;
        } catch (Exception e) {
            return "***string:replaceList error***";
        }
    }
}
