package io.iamofoe.DSA.sorting.bubble_sort;

import java.util.Arrays;

public class BubbleSortBasic {

    public static void main(String[] args) {
        int[] array1 = {12,65,21,4,65,35,78,1,33,64};

        System.out.println(Arrays.toString(bubbleSort(array1)));

        System.out.println(Arrays.toString(bubbleSortDescending(array1)));


    }

    private static int[] bubbleSortDescending(int[] arr) {
        int len = arr.length - 1;
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < len; i++) {
                if (arr[i+1] > arr[i]) {
                    sorted = false;
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            len -= 1;
        }
        return arr;
    }


    private static int[] bubbleSort(int[] array) {
        int lengthUntilSorted = array.length - 1;
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < lengthUntilSorted; i++) {
                if (array[i] > array[i+1]) {
                    sorted = false;
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
            lengthUntilSorted -= 1;
        }
        return array;
    }
}
