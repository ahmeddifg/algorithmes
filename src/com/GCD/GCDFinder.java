package com.GCD;

import java.util.Scanner;

public class GCDFinder {
    // find the Greatest common divisor of two numbers
    // by using Efficient Algorithm
    // input of two numbers a b

    private static int findGCD(int a, int b) {
        if(b==0){
            return a;
        }
        int x = a%b;
        return findGCD(b,x);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(findGCD(a, b));
    }
}
