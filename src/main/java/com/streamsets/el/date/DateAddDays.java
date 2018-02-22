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
import java.util.Calendar;
import java.util.Date;

/**
 * DateFormat.java - Streamsets expression language function for date calculation
 *                   Allows you add days to a date
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class DateAddDays {

    /**
     *
     * @param oldString The original date string
     * @param format The original date format
     * @param days The number of days to add
     * @return String The calculated date as a string
     */
    @ElFunction(
            prefix = "date",
            name = "addDays",
            description = "Takes a string date, adds a specified number of days and returns the incremented value"
    )
    public static String addDays(
            @ElParam("oldString") String oldString, @ElParam("format") String format, @ElParam("days") int days
    ) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date d = sdf.parse(oldString);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(d);
            calendar.add(Calendar.DATE, days);
            d = calendar.getTime();
            return sdf.format(d);
        } catch (Exception e) {
            return null;
        }
    }
}
