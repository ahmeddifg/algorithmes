package com.fibonacci;

import java.util.*;

public class FibonacciLastDigit {
    public static ArrayList<Long> fibonacciList = new ArrayList<Long>();

    private static Long getFibonacciLastDigitNaive(int n) {
        if (n < fibonacciList.size())
            return fibonacciList.get(n);

        for (int i = 2; i <= n; i++)
            fibonacciList.add((getFibonacciLastDigitNaive(i - 1) + getFibonacciLastDigitNaive(i - 2))%10);

        return fibonacciList.get(n);
    }

    public static void main(String[] args) {
        fibonacciList.add((long) 0);
        fibonacciList.add((long) 1);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

