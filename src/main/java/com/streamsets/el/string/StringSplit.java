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
 * StringSplit.java - Streamsets expression language function for java string split method
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class StringSplit {

    /**
     *
     * @param inString The original string
     * @param regex The regex to split on
     * @param index  The index of the array to return
     * @return String The string at the index of the array resulting from the split
     */
    @ElFunction(
            prefix = "string",
            name = "split",
            description = "Returns a string at the index of the array resulting from the split"
    )
    public static String split(
            @ElParam("inString") String inString, @ElParam("regex") String regex, @ElParam("index") int index
    ) {
        try {
            return inString.split(regex)[index];
        } catch (Exception e) {
            return "***string:split error***";
        }
    }
}
