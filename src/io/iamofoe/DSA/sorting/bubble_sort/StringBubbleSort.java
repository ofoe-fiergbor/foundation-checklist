package io.iamofoe.DSA.sorting.bubble_sort;

import java.util.Arrays;

public class StringBubbleSort {

    public static void main(String[] args) {
        String[] stringArray = {"abcdefg","abc","abcdef", "ab", "abcde", "abcd", "abcdefgh"};
        System.out.println(Arrays.toString(stringLengthBubbleSort(stringArray)));
    }

    private static String[] stringLengthBubbleSort(String[] stringArray) {
        int lenUntilSorted = stringArray.length - 1;
        String temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lenUntilSorted; i++) {
                if (stringArray[i].length() > stringArray[i+1].length()) {
                    sorted = false;
                    temp = stringArray[i+1];
                    stringArray[i+1] = stringArray[i];
                    stringArray[i] = temp;
                }
            }
            lenUntilSorted -= 1;
        }

        return stringArray;
    }
}
