package com.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FirstFactorial {

    public static long getFactorial(int num) {
        if (num == 1 || num == 0)
            return 1;
        if (num == 2)
            return 2;
        return num * getFactorial(num - 1);
    }

    public static void main(String[] arg) {
        FastScanner scanner = new FastScanner(System.in);
        System.out.println("Please enter you want to get factorial of:");
        int num = (int) scanner.nextInt();
        System.out.println("the result is:" + getFactorial(Math.abs(num)));
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
