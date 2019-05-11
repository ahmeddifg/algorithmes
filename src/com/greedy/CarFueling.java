package com.greedy;
//

import java.util.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int currentStop = 0;
        int selectedStation = -1;
        int countStops = 0;
        int currentStationValue = 0;
        int prvSelcetion = -1;
        if ((dist - stops[stops.length - 1]) > tank)
            return -1;

        if (tank >= dist)
            return 0;
        else {
            while (tank < dist - currentStationValue) {
                if (tank >= dist - currentStationValue)
                    return countStops;

//                selectedStation = -1;
                for (int i = currentStop; i < stops.length; i++) {
                    if (tank >= stops[i] - currentStationValue) {
                        selectedStation = i;
                    }
                }

                if (prvSelcetion == selectedStation)
                    return -1;

                if (selectedStation != -1) {
                    prvSelcetion = currentStop;
                    currentStop = selectedStation;
                    currentStationValue = stops[selectedStation];
                    ++countStops;

                } else {
                    countStops = -1;
                    break;
                }
            }
        }
        return countStops;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();

        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }

}
