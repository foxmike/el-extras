package com.streamsets.el.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class DateTest {

    public static void main(String[] args) {

        final String OLD_FORMAT = "dd/MM/yyyy";
        final String NEW_FORMAT = "yyyy/MM/dd";

// August 12, 2010
        try {
            String oldDateString = "12/08/2010";
            String newDateString;

            SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
            Date d = sdf.parse(oldDateString);
            sdf.applyPattern(NEW_FORMAT);
            newDateString = sdf.format(d);
            System.out.println(newDateString);
        } catch(Exception e) {e.printStackTrace();}

    }

}
