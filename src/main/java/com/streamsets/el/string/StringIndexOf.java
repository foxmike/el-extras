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
 * StringIndexOf.java - Streamsets expression language function for java string indexOf method
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class StringIndexOf {

    /**
     *
     * @param inString The original string
     * @param anotherString The string to locate
     * @return int the index of the first occurrence
     */
    @ElFunction(
            prefix = "string",
            name = "indexOf",
            description = "Returns the index of the first occurrence of the specified string"
    )
    public static int indexOf(
            @ElParam("inString") String inString, @ElParam("anotherString") String anotherString
    ) {
        try {
                return inString.indexOf(anotherString);
        } catch (Exception e) {
            return -1;
        }
    }
}
