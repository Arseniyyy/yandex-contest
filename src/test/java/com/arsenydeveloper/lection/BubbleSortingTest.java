package com.arsenydeveloper.lection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * BubbleSortingTest
 */
public class BubbleSortingTest {

    @Test
    void testSort() {
        int[] unsorted = {4, 2, 6, 5, 9, 1, 10, 12};
        int[] expected = {1, 2, 4, 5, 6, 9, 10, 12};
        int[] actual = BubbleSorting.sort(unsorted);

        assertArrayEquals(expected, actual);
    }
}
