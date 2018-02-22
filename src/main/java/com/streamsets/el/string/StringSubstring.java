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
import java.util.regex.*;

/**
 * StringSubstring.java - Streamsets expression language function for java string substring method
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class StringSubstring {

    /**
     *
     * @param inString The original string
     * @param startIndex The start index
     * @param endIndex  The end index (if less than start index only use start index)
     * @return String The substring
     */
    @ElFunction(
            prefix = "string",
            name = "substring",
            description = "Returns a substring using specified startIndex and endIndex"
    )
    public static String substring(
            @ElParam("inString") String inString, @ElParam("startIndex") int startIndex, @ElParam("endIndex") int endIndex
    ) {
        try {
            if(startIndex > endIndex)
                return inString.substring(startIndex);
            else
                return inString.substring(startIndex, endIndex);
        } catch (Exception e) {
            return "***string:substring error***";
        }
    }
}
