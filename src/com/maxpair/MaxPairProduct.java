package com.maxpair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPairProduct {

    // The Task is to find the max pair of number in array with max product.
    // sample input n as number of elements
    // then n1 n2 n3 n4 n5 numbers must me positives
    // As sample input
    // 4
    // 2 6  4 1
    // you will get result as "Number1: 6 Number2: 4 The result: 24"

    public static long getMaxPairwiseProduct(long[] arr) {
        long number1 = -1;
        long number2 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (number1 < arr[i]) {
                number2 = number1;
                number1 = arr[i];
            } else if (number2 < arr[i]) {
                number2 = arr[i];
            }
        }
        System.out.println("Number1: " + number1 + " Number2: " + number2 + " The result: " + (number1 * number2));

        return number1 + number2;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = (int) scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        getMaxPairwiseProduct(numbers);
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
            return Integer.parseInt(next());
        }
    }
}
