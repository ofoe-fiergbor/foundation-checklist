package io.iamofoe.DSA.sorting.bubble_sort;

import java.util.Arrays;

public class LeetcodeBubbleSort {

    public static void main(String[] args) {

//        int[] numArr = {2,0,2,1,1,0};
//        int[] numArr2 = {2,0,1};
//        System.out.println(Arrays.toString(sortColors(numArr)));
//        System.out.println(Arrays.toString(sortColors(numArr2)));

        int[] arr912 = {5,2,3,1};
        int[] arr912_2 = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(arr912)));
        System.out.println(Arrays.toString(sortArray(arr912_2)));
    }



    /** 75.
     * Given an array 'nums' with 'n' objects colored red, white or blue,
     * sort them in place so that objects of the same color are adjacent with the colors in the order red, white and blue.
     * We will use the integers 0, 1, and 2 to represent the color red, white and blue respectively.
     * You must solve this problem without using the library's sort function.
     * */

    private static int[] sortColors(int[] arr) {
        int len = arr.length - 1;
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < len; i++)
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            len -= 1;
        }
        return arr;
    }

    /**912. Sort an Array
     * Given an array of integers nums, sort the array in ascending order.
     * */
    private static int[] sortArray(int[] nums) {
        int len = nums.length - 1;
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < len; i++) {
                if (nums[i] > nums[i+1]) {
                    sorted = false;
                    temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
            len -= 1;
        }
        return nums;
    }
}


