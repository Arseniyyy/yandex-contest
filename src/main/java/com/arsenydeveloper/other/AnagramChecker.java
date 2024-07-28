package com.arsenydeveloper.other;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * CheckIfStringIsAnagram
 */
public class AnagramChecker {

    public static void main(String[] args) {
        check("aabcabc", "ccbbaaa");
    }

    public static void check(String s1, String s2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        char[] stringAsArr1 = s1.toCharArray();
        char[] stringAsArr2 = s2.toCharArray();

        for (int i = 0; i < stringAsArr1.length; i++) {
            int amount = map1.getOrDefault(stringAsArr1[i], 0);
            map1.put(stringAsArr1[i], amount + 1);
        }

        for (int i = 0; i < stringAsArr2.length; i++) {
            int amount = map2.getOrDefault(stringAsArr2[i], 0);
            map2.put(stringAsArr2[i], amount + 1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            int amount = entry.getValue();
            l1.add(amount);
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            int amount = entry.getValue();
            l2.add(amount);
        }

        System.out.println(l1);
        System.out.println(l2);
    }
}
