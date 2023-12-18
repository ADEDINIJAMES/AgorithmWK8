package org.example;

import java.util.Arrays;

public class SumOfElementWithoutHighestAndLowest {

        public static int sum(int[] numbers)
        {
            int sum=0;

            if (numbers==null){
                return  sum;
            }
            Arrays.sort(numbers);

            for(int i=1; i<=numbers.length-2; i++){
                sum+= numbers[i];
            }
            return sum;
        }

    public static void main(String[] args) {
        System.out.println(sum(new int[] { 6, 2, 1, 8, 10}));
    }
    }

