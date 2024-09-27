import java.util.List;
import java.util.ArrayList;

public class ComplexityDemo {

    /**
     * Calculates the sum of the elements in an array.
     * Uses a simple loop, hence the complexity is O(n).
     *
     * @param array The array of integers.
     * @return The sum of the elements in the array.
     */
    public static long sumArray(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num; // O(n)
        }
        return sum;
    }

    /**
     * Replaces elements in an ArrayList if they are less than the given threshold.
     * The complexity is O(n).
     *
     * @param numbers   The ArrayList of integers.
     * @param threshold The threshold value.
     * @param newValue  The new value to set for elements less than the threshold.
     */
    public static void replaceIf(ArrayList<Integer> numbers, int threshold, int newValue) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < threshold) {
                numbers.set(i, newValue);
            }
        }
    }

    /**
     * Generates a list of prime numbers less than the given maximum.
     * Utilizes nested loops, resulting in a complexity of approximately O(n√n).
     *
     * @param max The maximum integer value (exclusive).
     * @return An ArrayList containing all prime numbers less than max.
     */
    public static ArrayList<Integer> listPrimes(int max) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        // Testing sumArray function
        int[] numbers = {1, 2, 3, 4, 5};
        long sum = sumArray(numbers);
        System.out.println("Sum of array: " + sum);

        // Testing replaceIf function
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(15);
        replaceIf(list, 10, 100);
        System.out.println("List after replacing: " + list);

        // Testing listPrimes function
        ArrayList<Integer> primes = listPrimes(30);
        System.out.println("Primes less than 30: " + primes);
    }
}