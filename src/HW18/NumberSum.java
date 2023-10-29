/*
 * TITLE: Homework Set 18 - NumberSum
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION: Read X integers from the user and add them together, where X is provided by the user.
 */

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int loops;
        int sum;

        System.out.print("Enter the number of integers to add: ");
        loops = sc.nextInt();

        // Read input to sum
        for (sum = 0; loops > 0; loops--) {
            System.out.print("Enter an integer: ");
            sum += sc.nextInt();
        }

        System.out.println("The sum is " + sum + ".");
    }
}
