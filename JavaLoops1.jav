import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        int number = scanner.nextInt(); // Read an integer from the console and store it in variable number
        for(int multiplier = 1; multiplier <= 10; multiplier++) // Loop from 1 to 10
        {
            // Print the result of multiplying number by multiplier, along with some text
            System.out.println(number + " x " + multiplier + " = " + multiplier * number);
        }
    }
}
