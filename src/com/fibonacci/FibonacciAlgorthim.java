package com.fibonacci;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciAlgorthim {


    public static ArrayList<BigInteger> fibonacciList=new ArrayList<BigInteger>();

    public static BigInteger getFibbonacciNumber(int n){
//        System.out5.println(n);
        if(n<fibonacciList.size())
            return fibonacciList.get(n);
        else
        fibonacciList.add(getFibbonacciNumber(n-1).add( getFibbonacciNumber(n-2)) );

        return fibonacciList.get(n);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fibonacciList.add(new BigInteger("0"));
        fibonacciList.add(new BigInteger("1"));

        System.out.println(getFibbonacciNumber(n));
    }
}
