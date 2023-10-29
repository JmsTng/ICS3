/*
 * TITLE: Homework Set 17 - TimeTable
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION: Read an integer from the user and print a multiplication table for that number.
 */

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int n;

        // Read input
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // Print table
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= Math.abs(n); i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
