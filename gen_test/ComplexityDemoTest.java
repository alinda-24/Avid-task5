package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexityDemoTest {

    @Test
    public void sumArrayCalculatesCorrectSumForPositiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        long expectedSum = 15;
        assertEquals(expectedSum, ComplexityDemo.sumArray(numbers));
    }

    @Test
    public void sumArrayCalculatesCorrectSumForNegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4, -5};
        long expectedSum = -15;
        assertEquals(expectedSum, ComplexityDemo.sumArray(numbers));
    }

    @Test
    public void sumArrayCalculatesCorrectSumForMixedNumbers() {
        int[] numbers = {-1, 2, -3, 4, 5};
        long expectedSum = 7;
        assertEquals(expectedSum, ComplexityDemo.sumArray(numbers));
    }

    @Test
    public void sumArrayReturnsZeroForEmptyArray() {
        int[] numbers = {};
        long expectedSum = 0;
        assertEquals(expectedSum, ComplexityDemo.sumArray(numbers));
    }

    @Test
    public void replaceIfReplacesValuesLessThanThreshold() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(100, 100, 3, 4, 5));
        ComplexityDemo.replaceIf(numbers, 3, 100);
        assertEquals(expected, numbers);
    }

    @Test
    public void replaceIfDoesNotReplaceValuesEqualToThreshold() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ComplexityDemo.replaceIf(numbers, 1, 100);
        assertEquals(expected, numbers);
    }

    @Test
    public void replaceIfHandlesEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        ComplexityDemo.replaceIf(numbers, 3, 100);
        assertEquals(expected, numbers);
    }

    @Test
    public void listPrimesGeneratesCorrectPrimeListUnder30() {
        ArrayList<Integer> expectedPrimes = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
        assertEquals(expectedPrimes, ComplexityDemo.listPrimes(30));
    }

    @Test
    public void listPrimesHandlesEdgeCaseInclusionOf2AsPrime() {
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        assertEquals(expectedPrimes, ComplexityDemo.listPrimes(3));
    }

    @Test
    public void listPrimesHandlesNoPrimesBelow2() {
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        assertEquals(expectedPrimes, ComplexityDemo.listPrimes(2));
    }

    @Test
    public void listPrimesHandlesNegativeInput() {
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        assertEquals(expectedPrimes, ComplexityDemo.listPrimes(-10));
    }

    @Test
    public void listPrimesHandlesLargeInputPerformance() {
        long startTime = System.currentTimeMillis();
        ComplexityDemo.listPrimes(100000);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        // Check if the calculation is done in a reasonable time frame, e.g., 3 seconds
        assert duration < 3000 : "Performance test failed; took " + duration + " milliseconds.";
    }
}