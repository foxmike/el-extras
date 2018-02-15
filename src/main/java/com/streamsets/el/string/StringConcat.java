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
 * StringConcat.java - Streamsets expression language function for java string concat method
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class StringConcat {

    /**
     *
     * @param inString The original string
     * @param anotherString The string to concatenate at the end of the original string
     * @return String The string after the concatenation
     */
    @ElFunction(
            prefix = "string",
            name = "concat",
            description = "Returns a concatenated string"
    )
    public static String concat(
            @ElParam("inString") String inString, @ElParam("anotherString") String anotherString
    ) {
        try {
                return inString.concat(anotherString);
        } catch (Exception e) {
            return "***string:concat error***";
        }
    }
}
