# Time Complexity and Collections in Java

This task introduces you to the concept of time complexity and its applications in Java programming using collections such as `Array` and `ArrayList`. 

### 📝 Preparation

- Review the [lecture slides on Time Complexity](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html).
- Read the materials in [Module 6: Complexity Analysis](https://example.com).

### ✅ Learning Goals
By completing this task, you will:

- Work with `Arrays` and `ArrayLists` effectively.
- Understand the `static` keyword and how it influences method behavior.
- Combine loops with collections to enhance efficiency.
- Analyze and apply time complexity concepts in solving problems.

### 🚨 Troubleshooting Guide
1. Check this week's [posted issues](https://example.com/help/issues) to see if others have encountered similar problems.
2. If your issue is not listed, create a [New Issue](https://example.com/help/issues/new) with a descriptive title starting with "Task *x*: *summary of problem here*".
3. Discuss problems with classmates but do not share solutions. Use AI tools for understanding concepts, not for submitting solutions.

Remember, you must be responsible for your solutions and be able to explain them if asked.

---

### 🏛 Assignment

In this task, you will explore various ways to work with arrays and array lists while understanding the importance of time complexity. This will help you write efficient code by analyzing and optimizing your logic.

<details>
<summary> 📚 A summary of Java's Arrays and ArrayLists </summary>

Arrays and ArrayLists are fundamental data structures in Java. They allow storing collections of data but with different capabilities. Arrays have a fixed size, whereas ArrayLists can grow dynamically.

```java
// Basic Array
int[] numbers = {10, 20, 30, 40};

// ArrayList 
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
```

Arrays use simple syntax and have fixed memory allocation. ArrayLists, on the other hand, can dynamically expand but need to be imported.

For loops can iterate over these collections:

```java
// Iterating an array
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Iterating an ArrayList
for (int number : list) {
    System.out.println(number);
}
```

Using these loops, you can perform efficient operations on large data sets. 

</details>

<details>
<summary> 📚 The static Keyword </summary>

The `static` keyword indicates that a member belongs to a class rather than any object. Static members can be accessed without an instance of the class.

```java
public class Utils {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

// Usage
int result = Utils.multiply(3, 4);
```

</details>

### Time Complexity Analysis

Understanding and managing the time complexity of operations in programming is crucial. It involves how the time to complete an operation increases with input size.

#### Exercise 6.0 -- Time Complexity Analysis
Write a method to find the sum of an array, and measure the time it takes. You should compare time complexities: O(1), O(n), and O(n^2).

```java
public static long sumArray(int[] array) {
    long sum = 0;
    for (int num : array) {
        sum += num; // O(n)
    }
    return sum;
}
```

<details>
<summary> 💡 Tip: Measure Execution Time </summary>

Use `System.nanoTime()` to measure execution time:

```java
long startTime = System.nanoTime();
sumArray(new int[1000]);
long endTime = System.nanoTime();
long duration = (endTime - startTime);  // Duration in nanoseconds
```
</details>

#### Exercise 6.1 -- Working with Nested Loops

Create a method to replace elements in an ArrayList if a condition is met, and analyze its time complexity.

```java
public static void replaceIf(ArrayList<Integer> numbers, int threshold, int newValue) {
    for (int i = 0; i < numbers.size(); i++) {  // O(n)
        if (numbers.get(i) < threshold) {        // O(1)
            numbers.set(i, newValue);            // O(1)
        }
    }
}
```

#### Exercise 6.2 -- Challenging Complexity

Design a method that will create an ArrayList of prime numbers less than a given number using nested loops.

```java
public static ArrayList<Integer> listPrimes(int max) {
    ArrayList<Integer> primes = new ArrayList<>();
    for (int i = 2; i < max; i++) {              // Outer: O(n)
        boolean isPrime = true;
        for (int j = 2; j * j <= i; j++) {        // Inner: O(√n)
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
```

This exercise requires understanding the efficiency of algorithms and refining them based on time complexities.

### Submission Instructions

- Implement the required methods in the `ComplexityDemo.java` file.
- Ensure all your methods are marked as `static`.
- Test your methods using different input sizes and analyze the results.
- Provide comments explaining the expected time complexity for each method.

By completing these exercises, you will develop a deeper understanding of time complexity in programming and how it affects code performance. Enjoy experimenting and optimizing!