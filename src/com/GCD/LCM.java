package com.GCD;

import java.util.Scanner;

public class LCM {

    private static long findGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        long x = a % b;
        return findGCD(b, x);
    }

    private static long lcm_naive(long a, long b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(lcm_naive(a, b));
    }
}
