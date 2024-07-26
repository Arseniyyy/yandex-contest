package com.arsenydeveloper.lection;

import java.util.HashMap;
import java.util.Map;

/**
 * First
 */
public class MostFrequentCharacter {

    // private static final String INPUT = "";

    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100_000; i++) {
            s += "e";
        }
        System.out.println(findViaHashMap(s));
    }

    public static char findViaHashMap(String s) {
        Map<Character, Integer> occurences = new HashMap<>();
        char[] string = s.toCharArray();
        char mostFrequentChar = ' ';
        int max = 0;

        for (int i = 0; i < string.length; i++) {
            char ch = string[i];
            if (occurences.getOrDefault(ch, 0) == 0) {
                occurences.put(ch, occurences.getOrDefault(ch, 0) + 1);
            }
            occurences.put(ch, occurences.get(ch) + 1);
            if (occurences.get(ch) > max) {
                max = occurences.get(ch);
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}
