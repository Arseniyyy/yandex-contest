package com.arsenydeveloper.other;

import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) throws Exception {
        int number = 2;
        int[] arr = {1, 2, 2, 4, 5, 6};

        System.out.printf("The index of %d is:\n", number);
        System.out.println(search(number, arr));
    }

    public static int search(int number, int[] sortedArr) {
        int[] sortedArrCopy = new int[sortedArr.length];

        for (int i = 0; i < sortedArr.length; i++) {
            sortedArrCopy[i] = sortedArr[i];
        }

        while (true) {
            int length = sortedArr.length;
            int middleIndex = (int) Math.floor((double) length / 2);
            int middle = sortedArr[middleIndex];

            if (middle == number) {
                return findIndexOfElement(number, sortedArrCopy);
            } else if (middle > number) {
                sortedArr = Arrays.stream(sortedArr, 0, middleIndex).toArray();
            } else {
                sortedArr = Arrays.stream(sortedArr, middleIndex, length).toArray();
            }
        }
    }

    public static int findIndexOfElement(int element, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
