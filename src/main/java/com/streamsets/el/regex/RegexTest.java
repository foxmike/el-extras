package com.streamsets.el.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.IntStream;


public class RegexTest {

    public static void main(String[] args) {

//        String text    =
//                "John writes about this, and John Doe writes about that," +
//                        " and John Wayne writes about everything."
//                ;
//
//        String patternString1 = "((John) (.+?)) ";
//
//        Pattern pattern = Pattern.compile(patternString1);
//        Matcher matcher = pattern.matcher(text);
//
////        while(matcher.find()) {
////            System.out.println("found: <"  + matcher.group(1) +
////                    "> <"       + matcher.group(2) +
////                    "> <"       + matcher.group(3) + ">");
////        }
//        matcher.find(); //matcher.find();
//        System.out.println(matcher.group(1));


        String inString    =
                "John writes about this, and John writes about that," +
                        " and John writes about everything. "
                ;
        String regex = "((John) (.+?)) ";
        int instanceNo = 1;
        int groupNo = 3;

        try {
            Matcher matcher = Pattern.compile(regex).matcher(inString);

//            matcher.find();
//            System.out.println(matcher.group(3));
//            IntStream.range(0, instanceNo).forEach($ -> matcher.find());
//            System.out.println(matcher.group(groupNo));


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}