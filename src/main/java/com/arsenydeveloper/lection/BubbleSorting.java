package com.arsenydeveloper.lection;

import java.util.Arrays;

/**
 * BubbleSorting
 */
public class BubbleSorting {

    private static final int[] UNSORTED = {4, 3, 6, 2};

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(unsorted));
        // System.out.println(Arrays.toString(sort(unsorted)));
        System.out.println(Arrays.toString(sort(UNSORTED)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
