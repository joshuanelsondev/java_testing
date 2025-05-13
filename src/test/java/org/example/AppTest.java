package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSumOfDigits() {
        assertEquals(10, Algorithms.sumOfDigits(1234));
    }

    @Test
    public void testCountPrimes() {
        assertEquals(4, Algorithms.countPrimes(10));
    }

    @Test
    public void testSqrt() {
        assertEquals(3.0, Algorithms.sqrt(9.0, 2), 0.001);
    }

    @Test
    public void testIsPowerOfTwo() {
        assertTrue(Algorithms.isPowerOfTwo(32));
    }

    @Test
    public void testIsValidTriangle() {
        assertTrue(Algorithms.isValidTriangle(4, 4, 6));
    }

    @Test
    public void testReverseString() {
        assertEquals("dlroW ,olleH", Algorithms.reverseString("Hello, World"));
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(3, Algorithms.countOccurrences("Hello, World", 'l'));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(Algorithms.isPalindrome("racecar"));
    }

    @Test
    public void testFindMax() {
        int[] nums = {5,10,20,15,35,100,25,50,40};
        assertEquals(100, Algorithms.findMax(nums));
    }

    @Test
    public void testCalculateAverage() {
        int[] nums = {100, 0, 90, 88, 76, 60, 82, 94, 70, 80};
        assertEquals(74.0, Algorithms.calculateAverage(nums), 0.001);
    }

    @Test
    public void testIsSorted() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        assertTrue(Algorithms.isSorted(nums));
    }
}
