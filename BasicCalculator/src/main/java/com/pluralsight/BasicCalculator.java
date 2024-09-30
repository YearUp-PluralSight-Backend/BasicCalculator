package com.pluralsight;

import java.util.Scanner;

/**
 * BasicCalculator is a simple calculator program that performs basic arithmetic operations.
 * It prompts the user to enter two numbers and select an operation (add, subtract, multiply, divide).
 * The result of the operation is then displayed to the user.
 */
public class BasicCalculator {

    /**
     * The main method is the entry point of the program.
     * It calls the calculator method four times to perform calculations.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            calculator();
        }
    }

    /**
     * The calculator method handles the main logic of the calculator.
     * It prompts the user for two numbers and an operation, performs the operation, and prints the result.
     */
    public static void calculator() {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.println("This is a basic calculator program.");
        System.out.println("It will add two numbers and print the result.");

        // Get the first number
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        // Get the second number
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        // Get the operation
        String prompt = """
                Possible calculations:\\n +
                                (A)dd\\n +
                                (S)ubtract\\n +
                                (M)ultiply\\n +
                                (D)ivide\\n +
                                Please select an option:\
                """;
        System.out.println(prompt);
        char operation = scanner.next().charAt(0);
        double result;

        // Perform the operation
        if (operation == 'A' || operation == 'a') {
            result = firstNumber + secondNumber;
        } else if (operation == 'S' || operation == 's') {
            result = firstNumber - secondNumber;
        } else if (operation == 'M' || operation == 'm') {
            result = firstNumber * secondNumber;
        } else if (operation == 'D' || operation == 'd') {
            if (secondNumber == 0) {  // Check if the second number is 0
                System.out.println("Your second number cannot be 0");
                return;
            }
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Invalid operation. Please try again.");
            return;
        }

        // Print the result
        System.out.println("Result : " + result);
    }
}