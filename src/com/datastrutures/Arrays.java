package com.datastrutures;

import com.divideandconquer.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Arrays {
    ////////////////////////////////////////////////////////////////////////////////
    ////////////////Merg Two sorted arrays into one array///////////////////////////
    ////////////////O(a+b)/////////////////////////////////////////////////////////
    public static long[] MergTwoSortedArraysIntoOne(long array1[], long[] array2) {
        long[] mergArray = new long[array1.length + array2.length];
        int mergIndex = 0;
        int i = 0;
        int j = 0;
        if (array2.length == 0)
            mergArray = array1;

        if (array1.length == 0)
            mergArray = array2;

        while (i < array1.length || j < array2.length) {
            if (i < array1.length && array1[i] <= array2[j]) {
                mergArray[mergIndex] = array1[i];
                i++;
                mergIndex++;
            } else {
                mergArray[mergIndex] = array2[j];
                j++;
                mergIndex++;
            }
        }
        return mergArray;
    }

    ////////////////////////////////////////////////////////////////////////
    //////////////////////Find two number in array that sum a target////////
    ////////// nums = [2, 7, 11, 15], target = 9, output return [0, 1].////
    public static int[] findTwoSum(long[] array, long target) {
        int i = 0;
        int j = array.length - 1;
        while (i != j) {
            if ((array[i] + array[j]) == target) {
                return new int[]{i, j};
            } else if ((array[i] + array[j]) > target) {
                j--;
            } else if ((array[i] + array[j]) == target) {
                i++;
            }
        }
        return new int[]{-1};
    }

    ////////////////////////////////////////////////////////////////////
    //////////////////////Move Zeros to end of the array////////////////
    ///////////////////Input: [0,1,0,3,12]/////////////////////////////
    //////////////////Output: [1,3,12,0,0]//////////////////////////////////////////////////
    public static long[] moveZerosToEnd(long[] array) {
        int i = 0;
        int j = array.length - 1;
//        long temp=0;
        while (i != j) {
            if (array[j] == 0) {
                j--;
            } else if (array[i] == 0) {
                array[i] = array[j];
                array[j] = 0;
                i++;
            } else if (array[i] != 0) {
                i++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        System.out.println();
        System.out.println("Enter number of elements in first array1:");

        int array1Length = (int) scanner.nextInt();
        long[] array1 = new long[array1Length];
        for (int i = 0; i < array1Length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("You entered:");
        System.out.println();
        java.util.Arrays.stream(array1).forEach(e -> System.out.print(e + "  "));
        System.out.println();
        java.util.Arrays.stream((moveZerosToEnd(array1))).forEach(e -> System.out.print(e + "  "));
//        System.out.println();
//        System.out.println("Enter number of elements in first array2:");
//        int array2Length = (int) scanner.nextInt();
//        long[] array2 = new long[array2Length];
//        for (int i = 0; i < array2Length; i++) {
//            array2[i] = scanner.nextInt();
//        }
//        System.out.println("You entered:");
//        java.util.Arrays.stream(array2).forEach(e -> System.out.print(e + "  "));
//        System.out.println("Out:");
//        java.util.Arrays.stream(MergTwoSortedArraysIntoOne(array1, array2)).forEach(e -> System.out.print(e + " "));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        long nextInt() {
            return Long.parseLong(next());
        }
    }
}
