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

package com.streamsets.el.regex;

import com.streamsets.pipeline.api.ElDef;
import com.streamsets.pipeline.api.ElFunction;
import com.streamsets.pipeline.api.ElParam;

import java.util.regex.Pattern;

/**
 * RegexLookingAt.java - Streamsets expression language function for java regex lookingAt method
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class RegexLookingAt {

    /**
     *
     * @param inString The string to test
     * @param regex The regular expression to test against
     * @return boolean The boolean result of the test
     */
    @ElFunction(
            prefix = "regex",
            name = "lookingat",
            description = "Returns true if the beginning of the string matches the regex"
    )
    public static boolean matches(
            @ElParam("inString") String inString, @ElParam("regex") String regex
    ) {
        try {
            return Pattern.compile(regex).matcher(inString).lookingAt();
        } catch (Exception e) {
            return false;
        }
    }
}
