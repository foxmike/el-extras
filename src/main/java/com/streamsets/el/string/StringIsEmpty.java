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
 * StringEquals.java - Streamsets expression language function for java string isEmpty method
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class StringIsEmpty {

    /**
     *
     * @param inString The string to test
     * @return Boolean The result of the test
     */
    @ElFunction(
            prefix = "string",
            name = "isEmpty",
            description = "Checks to see if a string is empty"
    )
    public static boolean isEmpty(
            @ElParam("inString") String inString
    ) {
        try {
                return inString.isEmpty();
        } catch (Exception e) {
            return false;
        }
    }
}
