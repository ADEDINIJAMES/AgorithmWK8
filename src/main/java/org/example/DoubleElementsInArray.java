package org.example;

import java.util.Arrays;

public class DoubleElementsInArray {
    public static int[] map(int[] arr) {
        int[]arrD= new int[arr.length];
        for(int i=0; i< arr.length;i++){
            arrD[i]= arr[i]*2;
        }
        return arrD;
    }
    //using Functional Programming
    public static int[] map2(int[] arr) {
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{8, 2, 2, 2, 8})));
        System.out.println(Arrays.toString(map(new int[]{0, 0, 0, 0, 0})));

    }
}
