package com.arsenydeveloper.other;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int number = 1;
        int[] arr = {1, 2, 2, 4, 5, 6};

        System.out.printf("The index of %d is:\n", number);
        System.out.println(search(number, arr));
    }

    public static int search(int number, int[] sortedArr) {
        int low = 0;
        int high = sortedArr.length - 1;

        while (low <= high) {
            int middleIndex = (low + high) / 2;
            int middle = sortedArr[middleIndex];

            if (middle == number) {
                return middleIndex;
            } else if (middle > number) {
                high = middleIndex - 1;
            } else {
                low = middleIndex + 1;
            }
        }

        return -1;
    }
}
