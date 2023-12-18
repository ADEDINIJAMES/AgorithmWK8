package org.example;

import java.util.Arrays;

public class SortOddFirstBeforeEven {
    public static int[] sortArray(int[] array) {
        int[]odd = new int[array.length];
        int[]even = new int[array.length];
        int oddCount=0;
        int evenCount=0;
        for (int i=0;i<array.length;i++){
            if ((array[i]%2)!=0){
                odd[oddCount++]= array[i];

            }else {
                even[evenCount++]=array[i];

            }
    }
        Arrays.sort(odd,0,oddCount);

        System.arraycopy(odd,0,array,0,oddCount);
        System.arraycopy(even,0,array,oddCount,evenCount);
    //        odd: The source array from which elements will be copied.
//        0: The starting index in the source array (odd) from which elements will be copied.
//        array: The destination array to which elements will be copied.
//        0: The starting index in the destination array (array) where elements will be copied.
//                oddCount: The number of elements to be copied.
//                This line effectively copies the elements from the odd array to the beginning of the  array. It starts copying from index 0 in both arrays and copies oddCount elements.
//
//                This operation is used in the context of sorting odd numbers while leaving even numbers at their original positions. It's part of the strategy to merge the sorted odd numbers back into the original array after sorting them separately

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));//{ 1, 3, 2, 8, 5, 4 }
    }
}
