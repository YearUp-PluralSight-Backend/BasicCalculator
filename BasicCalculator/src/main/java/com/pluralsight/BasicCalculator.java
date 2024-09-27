package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            calculator();
        }



    }

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
        System.out.println("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option:"
        );
        char operation = scanner.next().charAt(0);
        double result = 0;

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
