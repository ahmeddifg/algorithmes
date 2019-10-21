package com.sorting;

import java.util.Arrays;

public class BubbleSort {
     public static int[] bubbleSort(int[] arr){
         int temp;
         for(int i =0;i<arr.length;i++)
             for (int j=0;j<arr.length-1;j++){
                 if(arr[j]>arr[j+1]){
                     temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         return arr;
     }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 32, 45, 5, 32, 2, 211, 444, 2, -2, 3, 40, 34, 2, 1, 3, 14, 0, -1, 33, 4};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
