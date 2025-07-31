package org.twoi;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class FindMaxSumTest
{

    @Test
    public void sampleInputTest() {
        String[] arr = {"dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw"};
        assertEquals(13, FindMaxSum.maxDigitSum(arr));
    }

    @Test
    public void allLettersTest() {
        String[] arr = {"abcdef", "ghijkl"};
        assertEquals(0, FindMaxSum.maxDigitSum(arr));
    }

    @Test
    public void allDigitsTest() {
        String[] arr = {"123", "456"};
        assertEquals(15, FindMaxSum.maxDigitSum(arr));
    }

    @Test
    public void mixedTest() {
        String[] arr = {"a9b8", "c1d2e3"};
        assertEquals(17, FindMaxSum.maxDigitSum(arr));
    }

    @Test
    public void emptyStringsTest() {
        String[] arr = {"", "abc"};
        assertEquals(0, FindMaxSum.maxDigitSum(arr));
    }
}
