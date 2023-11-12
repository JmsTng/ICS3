/*
 * TITLE: Homework Set 25A - Smallest Diagonal
 * NAME: James Tung
 * DATE: 11/12/2023
 * DESCRIPTION: Write a program that finds the smallest diagonal of a 4x4 array.
 */

package HW25A;

import java.util.Scanner;

public class DiagonalSmallest {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 4;
        int[][] numbers = new int[SIZE][SIZE];
        int sum = 0;

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d:  ", i + 1);
            String[] values = sc.nextLine().split(" ");
            for (int j = 0; j < SIZE; j++) {
                numbers[i][j] = Integer.parseInt(values[j]);
            }
        }

        // Find smallest diagonal
        for (int i = 0; i < SIZE; i++) {
            sum += numbers[i][i]; // Top-left to bottom-right
            sum -= numbers[i][SIZE - i - 1]; // Top-right to bottom-left
        }

        // Output results
        if (sum < 0) {
            System.out.println("(1, 1) to (4, 4) diagonal is smaller.");
        } else if (sum > 0) {
            System.out.println("(1, 4) to (4, 1) diagonal is smaller.");
        } else {
            System.out.println("Both diagonals are equal.");
        }
    }
}
