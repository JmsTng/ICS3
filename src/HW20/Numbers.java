/*
 * TITLE: Homework Set 20 - Numbers
 * AUTHOR: James Tung
 * DATE: 10/14/2023
 * DESCRIPTION:
 */

package HW20;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int NUMBERS = 6;
        double[] numbers = new double[NUMBERS];

        // Read input
        for (int i = 0; i < NUMBERS; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = sc.nextDouble();
        }

        // Print numbers in reverse order
        for (int i = NUMBERS-1; i > 0; i--) {
            System.out.println(numbers[i]);
        }

        // Set all numbers to 110% of their original value
        for (int i = 0; i < NUMBERS; i++) {
            numbers[i] *= 1.1;
        }

        // Print all numbers greater than 50
        for (int i = 0; i < NUMBERS; i++) {
            if (numbers[i] > 50) {
                System.out.println(numbers[i]);
            }
        }
    }
}
