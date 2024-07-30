package com.arsenydeveloper.other;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * MiddleElement
 */
public class MiddleElement {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = reader.readLine().split(" ");
        Integer[] numbers = new Integer[line.length];

        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }

        writer.write(String.valueOf(findMiddle(numbers)));
        writer.flush();

        reader.close();
        writer.close();
    }

    public static int findMiddle(Integer[] numbers) {
        Arrays.sort(numbers, (Integer i1, Integer i2) -> i1 - i2);
        return numbers[1];
    }
}
