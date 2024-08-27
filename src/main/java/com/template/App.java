package com.template;

import java.util.ArrayList;
import java.util.List;

import static java.util.EnumSet.range;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int value = a + b;
        return value;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        int value = 0;
        if (a > b) {
            value = a;
        }
        if (b > a) {
            value = b;
        }
        return value;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int value = 1;
        for (int num = 1; num <= n; num++) {
            value *= num;
        }
        return value;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int length = 0;
        for (int i = 0; i < input.length(); i++) {
            length++;
        }
        return length;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}
