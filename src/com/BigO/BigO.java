package com.BigO;

import java.util.LinkedList;
import java.util.List;

public class BigO {
    //    -Big Os-
//    O(1) Constant- no loops
//    O(log N) Logarithmic- usually searching algorithms have log n if they are sorted (Binary Search)
//    O(n) Linear- for loops, while loops through n items
//    O(n log(n)) Log Liniear- usually sorting operations
//    O(n^2) Quadratic- every element in a collection needs to be compared to ever other element. Two
//    nested loops
//    O(2^n) Exponential- recursive algorithms that solves a problem of size N
//    O(n!) Factorial- you are adding a loop for every element
//    Iterating through half a collection is still O(n)
//    Two separate collections: O(a * b)
////////////////////////////////////////////////////
//    Rule 1: Always worst Case
//    Rule 2: Remove Constants
//    Rule 3: Different inputs should have different variables. O(a+b). A and B arrays nested would be
//    O(a*b)
//      + for steps in order
//      * for nested steps
//    Rule 4: Drop Non-dominant terms
////////////////////////////////////////////////////
    //Example of BigO of n(1);
    public static void bigOOfOne(int variable) {
        int x = variable;
        System.out.println(x);
    }

    //Example of BigO of O(n)
    public static void bigOfN1(String[] array) {
        int size = array.length; // O(1)
        for (String element : array) // O(n)
            System.out.println(element);
        //Rule (4) applied so overall O(n)
    }

    //Example of BigO of O(a+b)
    public static void bigOOfAAndB(String[] names, String[] locations) {
        for (String element : names) { // O(a)
            System.out.println(element);
        }

        for (String element : locations) { // O(b)
            System.out.println(element);
        }
        //Rule 3 applied O(a+b)
    }

    //Quadratic BigO O(n^2)
    public static int[] selectionSort(int[] ages) {
        int temp = 0;
        for (int i = 0; i < ages.length; i++)
            for (int j = 0; j < ages.length; j++) {
                if (ages[i] < ages[j]) {
                    temp = ages[i];
                    ages[i] = ages[j];
                    ages[j] = temp;
                }
            }
        return ages;
    }

    public static void main(String[] args) {
    }


}
