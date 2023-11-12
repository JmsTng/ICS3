/*
 * TITLE: Homework Set 21 - Reverse
 * NAME: James Tung
 * DATE: 11/12/2023
 * DESCRIPTION: Store 10 integers from the user in an array and reverse the array into a second one.
 */

package HW21;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
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
        }

        // Reverse array
        for (int i = 0; i < SIZE; i++) {
            list2[i] = list1[SIZE - i - 1];
        }

        // Output results
        System.out.printf("Array 1: %s%n", Arrays.toString(list1));
        System.out.printf("Array 2: %s%n", Arrays.toString(list2));
    }
}
