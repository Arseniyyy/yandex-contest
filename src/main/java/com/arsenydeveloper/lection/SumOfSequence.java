package com.arsenydeveloper.lection;

/**
 * SumOfSequence
 */
public class SumOfSequence {

    private static final int[] SEQUENCE = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        System.out.println(countSum(SEQUENCE));
    }

    public static long countSum(int[] sequence) {
        int sum = 0;

        if (sequence.length == 0) {
            return sum;
        }
        for (int i = 0; i < sequence.length; i++) {
            sum += sequence[i];
        }

        return sum;
    }
}
