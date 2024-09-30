package com.pluralsight;

import java.util.Scanner;

/**
 * The Main class contains the main method which is the entry point of the program.
 * It also contains a method to calculate the maximum, minimum, and average of a series of numbers entered by the user.
 */
public class Main {
    /**
     * The main method is the entry point of the program.
     * It calls the calculateMaxAndMinAndAverage method to perform the calculations.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        calculateMaxAndMinAndAverage();
    }

    /**
     * The calculateMaxAndMinAndAverage method prompts the user to enter numbers and calculates the smallest, largest, and average of the numbers entered.
     * The loop continues until the user enters -99.
     * The method handles invalid input by prompting the user to enter a valid number.
     */
    public static void calculateMaxAndMinAndAverage() {
        // Declare variables and initialize them
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        int number = 0;

        // Loop through the numbers
        while (number != -99) { // loop until number is -99
            System.out.println("Enter a number:");

            try {
                number = scanner.nextInt();

                if (number == -99) { // if number is -99 then break the loop
                    break;
                }

                if (count <= 9) { // if count is less than or equal to 9 then do the following
                    if (number < smallest) { // if number is less than smallest then assign number to smallest
                        smallest = number;
                    }

                    if (number > largest) { // if number is greater than largest then assign number to largest
                        largest = number;
                    }

                    sum += number;
                }

                count++;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        // Output results
        if (count > 0) { // Avoid division by zero if no valid input was given
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average: " + (sum / 10));
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}