package com.arsenydeveloper.other;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * BinarySearchTest
 */
public class BinarySearchTest {

    @Test
    void testSearch() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int number = 6;
        int expected = 5;
        int output = BinarySearch.search(number, input);

        assertEquals(expected, output);
    }

    @Test
    void testSearchSameElements() {
        int[] input = {1, 1, 1, 1, 1};
        int number = 1;
        int expected = 2;
        int output = BinarySearch.search(number, input);

        assertEquals(expected, output);
    }
}
