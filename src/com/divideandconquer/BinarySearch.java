package com.divideandconquer;

import java.io.*;
import java.util.*;

public class BinarySearch {

    static int binarySearch(long[] a, long x) {
        int left = 0, right = a.length - 1;
        int mid = 0;
        long temp = 0;
        while (left < right) {
            mid = left + ((right - left) / 2);
            temp = a[mid];
            if (temp == x)
                return mid;
            if (temp < x) {
                left = mid;
            }
            if (temp > x) {
                right = mid;
            }

            if (right - left == 1) {
                if (a[left] == x)
                    return left;
                else if (a[right] == x)
                    return right;
                else return -1;
            }
        }
        if (a[left] == x)
            return left;
        return -1;
    }

    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = (int) scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = (int) scanner.nextInt();
        long[] b = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a, b[i]) + " ");
        }
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
