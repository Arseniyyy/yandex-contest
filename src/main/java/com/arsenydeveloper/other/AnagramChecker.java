package com.arsenydeveloper.other;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * CheckIfStringIsAnagram
 */
public class AnagramChecker {

    public static void main(String[] args) throws Exception {
        System.out.println(check("daaabbbc", "aaabbcbd"));
    }

    // public static boolean check(String s1, String s2) throws Exception {
    //     if (s1.length() != s2.length()) {
    //         throw new Exception("Strings must be the same length.");
    //     }

    //     char[] s1CharArr = s1.toCharArray();
    //     char[] s2CharArr = s2.toCharArray();
    //     char[][] charArrays = {s1CharArr, s2CharArr};

    //     for (char[] arr : charArrays) {
    //         Arrays.sort(arr);
    //     }

    //     return Arrays.equals(s1CharArr, s2CharArr);
    // }

    public static boolean check(String s1, String s2) {
        int MAX_VAL = 8;
        int[] arr = {1, 1, 1, 5, 5, 4, 8, 6, 2, 1, 1, 0};
        int[] count = new int[MAX_VAL + 1];

        for (int i = 0; i < count.length; i++) {
            count[]
        }
    }
}
