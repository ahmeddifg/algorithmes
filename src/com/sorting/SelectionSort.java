package com.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        int temp;
        for(int i=0 ; i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 32, 45, 5, 32, 2, 211, 444, 2, -2, 3, 45, 34, 2, 1, 3, 14, 0, -1, 33, 4};
        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}