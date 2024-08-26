package com.arsenydeveloper.lection1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A
 */
public class A {

    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<List<Integer>> ranges = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int[] input = processInput();
            List<Integer> range = findRange(input[0], input[1]);
            ranges.add(range);
        }

        List<Integer> vRange = ranges.get(0);
        List<Integer> mRange = ranges.get(1);

        writer.write(String.valueOf(getAmountOfTrees(vRange, mRange)));
        writer.flush();
    }

    public static int getAmountOfTrees(List<Integer> l1, List<Integer> l2) {
        List<Integer> intersection = getIntersection(l1, l2);
        boolean areListsEqual = checkIfTwoListsEqual(l1, l2);

        if (intersection.size() == 0) {
            return l1.size() + l2.size();
        } else if (areListsEqual) {
            return l2.size();
        } else if (areListsEqual) {
            return l1.size();
        }

        List<Integer> alteredlist = removeIntersection(l1, l2, intersection);
        return alteredlist.size() + intersection.size();
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

    public static boolean isFirstListGreaterThanSecond(List<Integer> l1, List<Integer> l2) {
        return l1.size() > l2.size() ? true : false;
    }

    public static List<Integer> removeIntersection(List<Integer> l1, List<Integer> l2, List<Integer> intersection) {
        for (int i : intersection) {
            int indexl1 = l1.indexOf(i);
            int indexl2 = l2.indexOf(i);
            l1.remove(indexl1);
            l2.remove(indexl2);
        }
        l1.addAll(l2);
        l1.sort((Integer i1, Integer i2) -> i1 - i2);

        return l1;
    }

    public static List<Integer> getIntersection(List<Integer> l1, List<Integer> l2) {
        List<Integer> intersection = new ArrayList<>();

        for (int i1 : l1) {
            for (int i2 : l2) {
                if (i1 == i2) {
                    intersection.add(i1);
                }
            }
        }

        return intersection;
    }

    public static boolean checkIfTwoListsEqual(List<Integer> l1, List<Integer> l2) {
        if (l1.size() != l2.size()) {
            return false;
        }
        return l1.equals(l2);
    }
}
