package com.fibonacci;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciAlgorthim {

    // algorthim to find the fibonacci number of N
    //
    public static ArrayList<BigInteger> fibonacciList=new ArrayList<BigInteger>();

    public static BigInteger getFibbonacciNumber(int n){
        if(n<fibonacciList.size())
            return fibonacciList.get(n);
        for(int i=2; i<=n ;i++)
        fibonacciList.add(getFibbonacciNumber(i-1).add( getFibbonacciNumber(i-2)) );

        return fibonacciList.get(n);
    }

    public static void main(String args[]) {
        fibonacciList.add(new BigInteger("0"));
        fibonacciList.add(new BigInteger("1"));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getFibbonacciNumber(n));
    }
}
