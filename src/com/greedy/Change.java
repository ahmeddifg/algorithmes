package com.greedy;

import java.util.Scanner;

public class Change {
    //The goal in this problem is to find the minimum number of coins needed to change the input value
    // (an integer) into coins with denominations 1, 5, and 10.

    public static int coinsArray[] = new int[]{1, 5, 10};

    private static int getChange(int m) {
        //write your code here
        int coinsCounter = 0;
        int maxCoinElement = 1;
        int temp = 0;
        temp = m;
        while (m != 0) {
            ++coinsCounter;
            maxCoinElement = 0;
            temp = m;
            for (int i = 0; i < coinsArray.length; i++) {
                if (maxCoinElement <= coinsArray[i] && (m - coinsArray[i]) >= 0 ) {
                    maxCoinElement = coinsArray[i];
                }
            }
            m = temp-maxCoinElement;
        }
        return coinsCounter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

