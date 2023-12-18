package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOddLeaveEven {
    public static int[] sortArray(int[] array) {
        List<Integer> oddNumber= new ArrayList<>();
        for(int number: array){
            if ((number%2)!= 0 ){
                oddNumber.add(number);// Extraction of odd numbers
            }
        }
        Collections.sort(oddNumber);
        int oddNumCount=0;
        for(int i=0; i<array.length; i++){
            if ((array[i]%2)!=0){
                array[i]= oddNumber.get(oddNumCount++); //Replacing the odd numbers in the array with the one in the List
            }
        }
        return array;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));// should give{ 1, 3, 2, 8, 5, 4 }
    }
    }
