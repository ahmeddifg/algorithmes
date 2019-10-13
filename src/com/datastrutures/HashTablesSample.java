package com.datastrutures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HashTablesSample {

    //Access O(1)
    //Search O(1)
    //Insertion O(1)
    //Deletion O(1)

    /////////////////////////////////////////////////
    ///// Find first recurring element //////////////
    ///////input:[1,2,5,4,1,5] output:1//////////////
   public static Long findFirstRecurringElement(long[]array){
       Map<Long,Long> elements=new HashMap<Long,Long>();
       int i=0;
       while(i<array.length){
           if(elements.get(array[i])!=null)
               return array[i];
           else{
               elements.put(new Long(array[i]),new Long(array[i]));
               i++;
           }
       }
       return null;
   }
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        System.out.println();
        System.out.println("Enter number of elements in first array1:");

        int array1Length = (int) scanner.nextInt();
        long[] array1 = new long[array1Length];
        for (int i = 0; i < array1Length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("You entered:");
        System.out.println();
        java.util.Arrays.stream(array1).forEach(e -> System.out.print(e + "  "));
        System.out.println();
        System.out.println(findFirstRecurringElement(array1));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        long nextInt() {
            return Long.parseLong(next());
        }
    }
}
