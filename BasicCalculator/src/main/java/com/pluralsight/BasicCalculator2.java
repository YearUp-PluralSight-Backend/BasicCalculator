package com.pluralsight;

import java.util.Scanner;

/**
 * BasicCalculator2 is a simple calculator program that performs basic arithmetic operations.
 * It prompts the user to enter two numbers and select an operation (add, subtract, multiply, divide).
 * The result of the operation is then displayed to the user.
 */
public class BasicCalculator2 {


    /**
     * Scanner object to read input from the user.
     */

    final static Scanner scanner = new Scanner(System.in);

    /**
     * The main method is the entry point of the program.
     * It calls the calculator method to start the calculator.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        calculator();
    }

    /**
     * The calculator method handles the main logic of the calculator.
     * It prompts the user for two numbers and an operation, performs the operation, and prints the result.
     */
    public static void calculator() {
        System.out.println("Hello and welcome!");
        System.out.println("This is a basic calculator program.");
        System.out.println("It will add two numbers and print the result.");
        System.out.println("\n");

        // Get the first number
        double firstNumber = promptForDouble();
        // Get the second number
        double secondNumber = promptForDouble();

        // Get the operation
        char operation = promptForOperationType();
        double result;

        // Perform the operation
        if (operation == 'A' || operation == 'a') {
            result = add(firstNumber, secondNumber);
        } else if (operation == 'S' || operation == 's') {
            result = subtract(firstNumber, secondNumber);
        } else if (operation == 'M' || operation == 'm') {
            result = multiply(firstNumber, secondNumber);
        } else if (operation == 'D' || operation == 'd') {
            if (secondNumber == 0) {  // Check if the second number is 0
                System.out.println("Your second number cannot be 0");
                return;
            }
            result = divide(firstNumber, secondNumber);
        } else {
            System.out.println("Invalid operation. Please try again.");
            return;
        }

        // Print the result
        System.out.println("Result : " + result);

        scanner.close();
    }

    /**
     * Prompts the user to select an operation type.
     *
     * @return The character representing the selected operation.
     */
    public static char promptForOperationType() {
        String prompt = """
                Possible calculations:\\n +
                                (A)dd\\n +
                                (S)ubtract\\n +
                                (M)ultiply\\n +
                                (D)ivide\\n +
                                Please select an option:\
                """;
        System.out.println(prompt);
        char character = scanner.next().charAt(0);
        System.out.println("You entered: " + character);
        return character;
    }

    /**
     * Prompts the user to enter a number.
     *
     * @return The number entered by the user.
     */
    public static double promptForDouble() {
        System.out.println("Enter a number:");
        double number = scanner.nextDouble();
        System.out.println("You entered: " + number);
        return number;
    }

    /**
     * Adds two numbers.
     *
     * @param firstNumber  The first number.
     * @param secondNumber The second number.
     * @return The result of adding the two numbers.
     */
    public static double add(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        System.out.println("Result : " + result);
        return result;
    }

    /**
     * Subtracts the second number from the first number.
     *
     * @param firstNumber  The first number.
     * @param secondNumber The second number.
     * @return The result of subtracting the second number from the first number.
     */
    public static double subtract(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        System.out.println("Result : " + result);
        return result;
    }

    /**
     * Multiplies two numbers.
     *
     * @param firstNumber  The first number.
     * @param secondNumber The second number.
     * @return The result of multiplying the two numbers.
     */
    public static double multiply(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        System.out.println("Result : " + result);
        return result;
    }

    /**
     * Divides the first number by the second number.
     * If the second number is zero, an error message is displayed.
     *
     * @param firstNumber  The first number.
     * @param secondNumber The second number.
     * @return The result of dividing the first number by the second number.
     */
    public static double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Your second number cannot be 0");
            return 0;
        }
        double result = 0;
        try {
            result = firstNumber / secondNumber;
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("Result : " + result);
        return result;
    }
}