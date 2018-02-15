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
 * StringLastIndexOf.java - Streamsets expression language function for java string lastIndexOf method
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class StringLastIndexOf {

    /**
     *
     * @param inString The original string
     * @param anotherString The string to locate
     * @return int the index of the last occurrence
     */
    @ElFunction(
            prefix = "string",
            name = "lastIndexOf",
            description = "Returns the index of the last occurrence of the specified string"
    )
    public static int lastIndexOf(
            @ElParam("inString") String inString, @ElParam("anotherString") String anotherString
    ) {
        try {
                return inString.lastIndexOf(anotherString);
        } catch (Exception e) {
            return -1;
        }
    }
}
