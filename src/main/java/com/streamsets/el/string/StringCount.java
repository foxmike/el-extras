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
 * StringCount.java - Streamsets expression language function that counts the occurrences of a string within another string.
 * string:count("aaabbbcccaaa","aaa") = 2
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class StringCount {

    /**
     *
     * @param inString The original string
     * @param countString The string to count occurrences of
     * @return int The count
     */
    @ElFunction(
            prefix = "string",
            name = "count",
            description = "Returns the number of occurrences of one string within another string."
    )
    public static int count(
            @ElParam("inString") String inString, @ElParam("countString") String countString
    ) {
        try {
            int index = 0;
            int count = 0;
            int length = countString.length();
            while( (index = inString.indexOf(countString, index)) != -1 ) {
                index += length;
                count++;
            }

            return count;
        } catch (Exception e) {
            return -999999999;
        }
    }
}
