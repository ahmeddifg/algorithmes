package com;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;

public class Solution {
    class Point implements Comparable<Point>{
        int x;
        int y;

        public Point(int i, int i1) {
        }

        @Override
        public int compareTo(Point o) {
            return 0;
        }

        int calcDistanceToCenter(Point a ){
            Point center=new Point(0,0);
            return (int) Math.sqrt(((a.x- center.x)*2 + (a.y- center.y)*2 ));
        }
    }

//    public int[][] kClosest(int[][] points, int K) {
////        PriorityQueue<Point> kList=new PriorityQueue<>(1);
////        Math.p
//
//        Set<Character> js=new HashSet<Character>();
////        js.addAll("");
//
//    }

}
//