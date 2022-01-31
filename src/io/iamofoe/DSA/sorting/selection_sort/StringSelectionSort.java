package io.iamofoe.DSA.sorting.selection_sort;

import java.util.Arrays;

public class StringSelectionSort {
    public static void main(String[] args) {
        String[] stringArray = {"abcdefg","abc","abcdef", "ab", "abcde", "abcd", "abcdefgh"};
        System.out.println(Arrays.toString(selectionSortForStringArray(stringArray)));
    }

    private static String[] selectionSortForStringArray(String[] stringArray) {
        String temp;
        int indexOfLowestLength;

        for (int i = 0; i < stringArray.length; i++) {
            indexOfLowestLength = i;

            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[j].length() < stringArray[indexOfLowestLength].length()) {
                    indexOfLowestLength = j;
                }
            }
            if (indexOfLowestLength != i) {
                temp = stringArray[i];
                stringArray[i] = stringArray[indexOfLowestLength];
                stringArray[indexOfLowestLength] = temp;
            }
        }


        return stringArray;
    }
}
