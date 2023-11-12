/*
 * TITLE: Homework Set 21 - Self Reverse
 * NAME: James Tung
 * DATE: 11/12/2023
 * DESCRIPTION: Store 10 integers from the user in an array and reverse the array in place.
 */

package HW21;

import java.util.Scanner;

public class SelfReverse {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        int[] list = new int[SIZE];

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter an integer: ");
            list[i] = sc.nextInt();
        }

        // Output original
        System.out.printf("Original: %s%n", java.util.Arrays.toString(list));

        // Reverse array
        for (int i = 0; i < SIZE / 2; i++) {
            int temp = list[i];
            list[i] = list[SIZE - i - 1];
            list[SIZE - i - 1] = temp;
        }

        // Output results
        System.out.printf("Reversed: %s%n", java.util.Arrays.toString(list));
    }
}
