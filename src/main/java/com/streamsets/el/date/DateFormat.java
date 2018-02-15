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

package com.streamsets.el.date;

import com.streamsets.pipeline.api.ElDef;
import com.streamsets.pipeline.api.ElFunction;
import com.streamsets.pipeline.api.ElParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * DateFormat.java - Streamsets expression language function for date formatting
 *                   Allows you to convert from one date format to another
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class DateFormat {

    /**
     *
     * @param oldString The original date string
     * @param oldFormat The original date format
     * @param newFormat The format of the returned date
     * @return String The reformatted date as a string
     */
    @ElFunction(
            prefix = "date",
            name = "format",
            description = "Takes a date string of a particular format and converts it to another format"
    )
    public static String group(
            @ElParam("oldString") String oldString, @ElParam("oldFormat") String oldFormat, @ElParam("newFormat") String newFormat
    ) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(oldFormat);
            Date d = sdf.parse(oldString);
            sdf.applyPattern(newFormat);
            return sdf.format(d);
        } catch (Exception e) {
            return null;
        }
    }
}
