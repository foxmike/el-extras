package com.streamsets.el.string;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class StringTest {

    public static void main(String[] args) {
        try {
            System.out.println("test".startsWith("tes",0));
            System.out.println("test".replace("te","se"));
            String[] test = "a.b.c".split("\\.");
            System.out.println(test[0]);

            Random rand = new Random();
            String max = "3";
            String min = "1";
            for(int x = 1; x<1000; x++) {
                System.out.println(rand.nextInt((int) Double.parseDouble(max) - (int) Double.parseDouble(min)+1) + (int) Double.parseDouble(min));
                //System.out.println(rand.nextInt(2)+1);
            }

            System.out.println("first replace test");
            System.out.println("aaabbbccc".replace("a","A"));


//            System.out.println("ok new test the list replace");
//            String inString = "aaaabbbbcccc";
//            String oldList = "a|b";
//            String newList = "A|B";
//
//            String oldStrings[] = oldList.split("\\|");
//            String newStrings[] = newList.split("\\|");
//            if (oldStrings.length != newStrings.length) System.out.println("***string:replaceList error - list lengths do not match");
//            for (int x = 0; x < oldStrings.length; x++) {
//                inString = inString.replace(oldStrings[x], newStrings[x]);
//            }

//            System.out.println(inString);

            String inString = "aaabbbcccdddaaax";
            int count = 0;
            String countString = "aaa";
            int index = 0;
            int length = countString.length();
            while( (index = inString.indexOf(countString, index)) != -1 ) {
                index += length;
                count++;
            }

            System.out.println("inString="+inString+" countString="+countString+" and count=" +count);




        } catch (
                Exception e)

        {
            e.printStackTrace();
        }
    }
}