package com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        printArr(arr);
        int size = arr.length;
        int j = 0;
        for (int i = 1; i < size ; i++) {
            int pickElement = arr[i];
            j = i-1;
            while (j >=0 && arr[j] > pickElement) {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = pickElement;
        }
        printArr(arr);

        return arr;
    }

    public static void printArr(int[]arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }


    public static void main(String[] args) {
//        int[] arr = new int[]{1, 32, 45, 5, 32, 2, 211, 444, 2, -2, 3, 40, 34, 2, 1, 3, 14, 0, -1, 33, 4};
        int[] arr = new int[]{1, 4, 3, 5 ,6 ,2};
        insertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

}
