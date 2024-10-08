/*
 * TITLE: Homework Set 21 - Same Sum
 * NAME: James Tung
 * DATE: 11/7/2023
 * DESCRIPTION: Write a program that reads 10 integers and displays two arrays. The values with the same index in the two arrays should add to 25.
 */

package HW21;

import java.util.Arrays;
import java.util.Scanner;

public class SameSum {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        int[] list1 = new int[SIZE];
        int[] list2 = new int[SIZE];

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter an integer: ");
            list1[i] = sc.nextInt();
            list2[i] = 25 - list1[i]; // The corresponding values should add to 25
        }

        // Output results
        System.out.printf("Array 1: %s%n", Arrays.toString(list1));
        System.out.printf("Array 2: %s%n", Arrays.toString(list2));
    }
}
