import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

        int testCases = scanner.nextInt(); // Read the number of test cases from the console

        for (int testCase = 0; testCase < testCases; testCase++) { // Loop through each test case
            int initialTerm = scanner.nextInt(); // Read the initial term of the arithmetic series
            int commonDifference = scanner.nextInt(); // Read the common difference of the arithmetic series
            int numberOfTerms = scanner.nextInt(); // Read the number of terms in the arithmetic series

            int currentTermValue = initialTerm; // Initialize a variable to store the current term value, starting with the initial term

            for (int termIndex = 0; termIndex < numberOfTerms; termIndex++) { // Loop through each term of the arithmetic series
                // Calculate the value of the current term using the arithmetic series formula
                currentTermValue += (Math.pow(2, termIndex) * commonDifference);
                // Print the value of the current term followed by a space
                System.out.print(currentTermValue + " ");
            }
            // Move to the next line after printing all terms of the series for the current test case
            System.out.println();
        }
        // Close the Scanner to release system resources
        scanner.close();
    }
}
