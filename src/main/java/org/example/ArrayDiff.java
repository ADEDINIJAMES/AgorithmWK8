package org.example;

import java.util.Arrays;

public class ArrayDiff {
    public static int[] arrayDiff (int[]a, int[]b){
        return Arrays.stream(a).filter(element-> Arrays.stream(b).noneMatch(bElement->bElement==element)).toArray();
               // Arrays.stream(a).filter(element->Arrays.stream(b).noneMatch(bElement-> bElement==element)).toArray();
    }

    public static void main(String[] args) {
       int[]d= arrayDiff(new int[]{1,2,2,4}, new int[]{2});
        System.out.println(Arrays.toString(d));
    }
}
