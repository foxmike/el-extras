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
 * StringStartsWith.java - Streamsets expression language function for java string equals method
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class StringStartsWith {

    /**
     *
     * @param inString The original string
     * @param prefix The prefix to check for
     * @param offset The offset to check from
     * @return String The substring
     */
    @ElFunction(
            prefix = "string",
            name = "startsWith",
            description = "Returns a boolean based on whether the substring (starting from the specified offset index) has the specified prefix or not."
    )
    public static boolean startsWith(
            @ElParam("inString") String inString, @ElParam("prefix") String prefix, @ElParam("offset") int offset
    ) {
        try {
                return inString.startsWith(prefix, offset);
        } catch (Exception e) {
            return false;
        }
    }
}
