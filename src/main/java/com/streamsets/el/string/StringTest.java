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
        } catch (
                Exception e)

        {
            e.printStackTrace();
        }
    }
}