package com.arsenydeveloper.lection1;

import org.apache.commons.lang3.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A
 */
public class A {

    public static void main(String[] args) throws IOException {
        List<List<Integer>> ranges = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int[] input = processInput();
            List<Integer> range = findRange(input[0], input[1]);
            ranges.add(range);
        }

        List<Integer> vRange = ranges.get(0);
        List<Integer> mRange = ranges.get(1);

        System.out.println(vRange);
        System.out.println(mRange);
    }

    public static List<Integer> findRange(int a, int b) {
        int start = a - b;
        int end = a + b;
        List<Integer> range = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            range.add(i);
        }
        return range;
    }

    public static int[] processInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        return Arrays.stream(input.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
    }
}
