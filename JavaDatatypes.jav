import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        int numberOfTestCases = scanner.nextInt(); // Read the number of test cases from the console

        for(int testCase = 0; testCase < numberOfTestCases; testCase++) { // Loop through each test case
            try {
                long inputValue = scanner.nextLong(); // Read a long integer from the console
                System.out.println(inputValue + " can be fitted in:"); // Print a message indicating the value can be fitted in certain data types

                try {
                    byte byteValue = (byte) inputValue; // Attempt to convert inputValue to a byte
                    if(byteValue == inputValue) { // If the conversion is successful (no data loss), print that it can be fitted into a byte
                        System.out.println("* byte");
                    }
                } catch(Exception e) {} // Catch any exceptions thrown during the conversion (e.g., if the value cannot fit into a byte)

                try {
                    short shortValue = (short) inputValue; // Attempt to convert inputValue to a short
                    if(shortValue == inputValue) { // If the conversion is successful (no data loss), print that it can be fitted into a short
                        System.out.println("* short");
                    }
                } catch(Exception e) {} // Catch any exceptions thrown during the conversion (e.g., if the value cannot fit into a short)

                try {
                    int intValue = (int) inputValue; // Attempt to convert inputValue to an int
                    if(intValue == inputValue) { // If the conversion is successful (no data loss), print that it can be fitted into an int
                        System.out.println("* int");
                    }
                } catch(Exception e) {} // Catch any exceptions thrown during the conversion (e.g., if the value cannot fit into an int)

                System.out.println("* long"); // Print that the value can be fitted into a long
            } catch(Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere."); // If the value cannot fit into any data type, print an appropriate message
            }
        }
        scanner.close(); // Close the Scanner to release system resources
    }
}
