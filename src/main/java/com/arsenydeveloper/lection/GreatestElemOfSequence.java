package com.arsenydeveloper.lection;

/**
 * GreatestElemOfSequence
 */
public class GreatestElemOfSequence {

    private static final int[] SEQUENCE = {};

    public static void main(String[] args) {
        System.out.println(findGreatest(SEQUENCE));
    }

    public static int findGreatest(int[] sequence) {
        if (sequence.length == 0) {
            return 0;
        }
        int greatest = sequence[0];
        if (sequence.length == 0) {
        }
        for (int i = 1; i < sequence.length; i++) {
            int elem = sequence[i];
            if (elem > greatest) {
                greatest = elem;
            }
        }
        return greatest;
    }
}
