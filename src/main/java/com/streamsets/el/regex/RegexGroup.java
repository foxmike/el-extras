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

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * RegexGroup.java - Streamsets expression language function for java regex group method
 *                   Allows you to find the result of applying a particular group (groupNo) from a group regex to
 *                   a particular iteration (instanceNo) of a find
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class RegexGroup {

    /**
     *
     * @param inString The string to test
     * @param regex The regular expression to search for
     * @param instanceNo The iteration of the find to use
     * @param groupNo The group match to return
     * @return String The particular matched string
     */
    @ElFunction(
            prefix = "regex",
            name = "group",
            description = "Returns a match found in the string based on instance and group number"
    )
    public static String group(
            @ElParam("inString") String inString, @ElParam("regex") String regex, @ElParam("instanceNo") int instanceNo, @ElParam("groupNo") int groupNo
    ) {
        try {
            Matcher matcher = Pattern.compile(regex).matcher(inString);
            IntStream.range(0, instanceNo).forEach($ -> matcher.find());
            return matcher.group(groupNo);
        } catch (Exception e) {
            return null;
        }
    }
}
