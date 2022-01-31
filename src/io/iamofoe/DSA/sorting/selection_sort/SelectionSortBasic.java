package io.iamofoe.DSA.sorting.selection_sort;

import java.util.Arrays;

/**
 * O(N^2) TIME COMPLEXITY
 * */
public class SelectionSortBasic {

    public static void main(String[] args) {
        int[] arr = {4,2,7,1,3};

        System.out.println(Arrays.toString(selectionSort(arr)));
    }



    private static int[] selectionSort(int[] array) {
        int temp, lowestNumberIndex;

        for (int i = 0; i < array.length; i++) {
            lowestNumberIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowestNumberIndex]) {
                    lowestNumberIndex = j;
                }
            }
            if (lowestNumberIndex != i) {
                temp = array[i];
                array[i] = array[lowestNumberIndex];
                array[lowestNumberIndex] = temp;
            }
        }

        return array;
    }
}
