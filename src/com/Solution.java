package com;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {
        String temp;
        for (int i = 0; i < unsorted.length; i++)
            for (int j = 0; j < unsorted.length; j++) {
                if (checkMax(unsorted[j], unsorted[i])) {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        return unsorted;
    }

    static boolean checkMax(String s1, String s2) {
        if (s1.length() > s2.length())
            return true;
        else if (s1.length() < s2.length())
            return false;
        else {
            for (int i = 0; i < s1.length(); i++)
                if ( Integer.parseInt(s1.charAt(i)+"") > Integer.parseInt(s2.charAt(i)+""))
                    return true;
                else if (Integer.parseInt(s1.charAt(i)+"") < Integer.parseInt(s2.charAt(i)+""))
                    return false;
        }
        return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] unsorted = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            String unsortedItem = scanner.nextLine();
//            unsorted[i] = unsortedItem;
//        }

//        String[] result = bigSorting(new String[]{"1",
//                "2",
//                "100",
//                "12303479849857341718340192371",
//                "3084193741082937",
//                "3084193741082938",
//                "111",
//                "200"});
        String[] result = bigSorting(new String[]{
                "202",
                "201",
                "200",
                "204",
                "199"
               });

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }


    }
}
