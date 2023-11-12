/*
 * TITLE: Homework Set 25A - 1D Array Odd/Even
 * NAME: James Tung
 * DATE: 11/12/2023
 * DESCRIPTION: Write a program that checks if all numbers in an array are odd, even, or neither.
 */

package HW25A;

import java.util.Scanner;

public class Array1DOddEven {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        int[] numbers = new int[SIZE];

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = sc.nextInt();
        }

        // Check all odd/even
        boolean allOdd = true;
        boolean allEven = true;
        for (int i = 0; i < SIZE; i++) {
            if (numbers[i] % 2 == 0) {
                allOdd = false;
            } else {
                allEven = false;
            }

            if (!allOdd && !allEven) {
                break;
            }
        }

        // Output results
        if (allOdd) {
            System.out.println("All numbers are odd.");
        } else if (allEven) {
            System.out.println("All numbers are even.");
        } else {
            System.out.println("Not all numbers are odd or even.");
        }
    }
}
