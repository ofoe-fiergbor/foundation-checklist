package io.iamofoe.DSA.sorting.selection_sort;

import java.util.Arrays;

public class LeetcodeSelectionSort {

    public static void main(String[] args) {
        int[] numArr = {2,0,2,1,1,0};
        int[] numArr2 = {2,0,1};
        System.out.println(Arrays.toString(sortColors(numArr)));
        System.out.println(Arrays.toString(sortColors(numArr2)));
    }


    /** 75.
     * Given an array 'nums' with 'n' objects colored red, white or blue,
     * sort them in place so that objects of the same color are adjacent with the colors in the order red, white and blue.
     * We will use the integers 0, 1, and 2 to represent the color red, white and blue respectively.
     * You must solve this problem without using the library's sort function.
     * */
    private static int[] sortColors(int[] colors) {
        int temp, indexOfLowestNumber;

        for (int i = 0; i < colors.length; i++) {
            indexOfLowestNumber = i;
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[j] < colors[indexOfLowestNumber]) {
                    indexOfLowestNumber = j;
                }
            }
            if (indexOfLowestNumber != i) {
                temp = colors[i];
                colors[i] = colors[indexOfLowestNumber];
                colors[indexOfLowestNumber] = temp;
            }
        }

        return colors;
    }
}
