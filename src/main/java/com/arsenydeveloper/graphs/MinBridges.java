package com.arsenydeveloper.graphs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * MinBridges https://new.contest.yandex.ru/49584/problem?id=215/2023_04_24/fksEgaTvq6
 *
 */
public class MinBridges {

    public static void main(String[] args) throws IOException {
        findMinBridges();
    }

    public static void findMinBridges() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = reader.readLine().split(" ");
        int[] converted = new int[input.length];

        for (int i = 0; i < converted.length; i++) {
            converted[i] = Integer.parseInt(input[i]);
        }

        int islands = converted[0];
        int bridges = converted[1];
        int[][] connectedIslands = processInputConnectedIslands(islands, bridges, reader);


        reader.close();
        writer.close();
    }

    private static int[][] processInputConnectedIslands(int islands, int bridges, BufferedReader reader) throws IOException {
        int[][] connectedIslands = new int[bridges][];

        for (int i = 0 ; i < bridges; i++) {
            String[] pairOfIslandsString = reader.readLine().split(" ");
            int[] pairOfIslands = new int[pairOfIslandsString.length];
            for (int j = 0; j < pairOfIslands.length; j++) {
                pairOfIslands[j] = Integer.parseInt(pairOfIslandsString[j]);
            }

            connectedIslands[i] = pairOfIslands;
        }

        return connectedIslands;
    }
}
