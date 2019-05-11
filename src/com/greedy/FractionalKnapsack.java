package com.greedy;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class FractionalKnapsack {
//         thief finds much more loot than his bag can fit. Help him to find the most valuable combination
//         of items assuming that any fraction of a loot item can be put into his bag.
//         The first line of the input contains the number 𝑛 of items and the capacity 𝑊 of a knapsack.
//         The next 𝑛 lines define the values and weights of the items. The 𝑖-th line contains integers 𝑣𝑖 and 𝑤𝑖—the
//         value and the weight of 𝑖-th item, respectively.ic class FractionalKnapsack
//         Output the maximal value of fractions of items that fit into the knapsack


    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        ArrayList<Integer> selectedItemsList = new ArrayList<Integer>();
        double selectedItem = 0;
        int selectedItemIndex;
        while (capacity != 0 && selectedItemsList.size() != values.length) {
            selectedItem = -1;
            selectedItemIndex = -1;
            for (int i = 0; i < values.length; i++) {
                if (selectedItem < ((double) values[i] / (double) weights[i]) && !selectedItemsList.contains(new Integer(i))) {
                    selectedItem = ((double) values[i] / (double) weights[i]);
                    selectedItemIndex = i;
                }
            }
            if (capacity - weights[selectedItemIndex] >= 0) {
                capacity = capacity - weights[selectedItemIndex];
                value = value + (double) values[selectedItemIndex];
            } else {
                value = (double) value + ((double) capacity / (double) weights[selectedItemIndex]) * (double) values[selectedItemIndex];
                capacity = 0;
            }
            selectedItemsList.add(new Integer(selectedItemIndex));
        }
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(getOptimalValue(capacity, values, weights)));
    }
} 
