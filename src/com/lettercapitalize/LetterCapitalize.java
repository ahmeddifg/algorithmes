package com.lettercapitalize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LetterCapitalize {
    // Sample input : hello are you there
    // output: Hello Are You There
    public static String getLetterCapitalize(String value) {
        String temp = "";
        String[] strArray = value.split(" ");

        // to handel if there is more than one space between words
        strArray =  Arrays.stream(strArray).filter(e -> !e.equals("")).toArray(String[]::new);

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].toUpperCase().substring(0, 1) + strArray[i].substring(1);
            temp += strArray[i] + " ";
        }

        return temp;
    }

    public static void main(String[] arg) {
       int x=123;
        System.out.println( (x>=60?(int)(x/60):0 )+":"+((x%60)!=x?((int)(x%60)+""):x)  );
        System.out.println(x%60);
//        String value;
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            value = bufferedReader.readLine();
//            System.out.println("You entered: " + value);
//            System.out.println("After Letter Capitalize:  " + getLetterCapitalize(value));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
   }
}
