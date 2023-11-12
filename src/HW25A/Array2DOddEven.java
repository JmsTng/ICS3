/*
 * TITLE: Homework Set 25A - 2D Array Odd/Even
 * NAME: James Tung
 * DATE: 11/12/2023
 * DESCRIPTION: Check each row and column of a 2D array to see if all its numbers are odd, even, or neither.
 */

package HW25A;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DOddEven {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 3;
        int[][] numbers = new int[SIZE][SIZE];
        String[] values;

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d:  ", i);
            values = sc.nextLine().split(" ");
            numbers[i][0] = Integer.parseInt(values[0]);
            numbers[i][1] = Integer.parseInt(values[1]);
            numbers[i][2] = Integer.parseInt(values[2]);
        }

        // Check all odd/even
        for (int i = 0; i < SIZE; i++) {
            // Check rows
            if (Arrays.stream(numbers[i]).allMatch(n -> n % 2 == 0)) {
                System.out.printf("R%d: All numbers are even.%n", i);
            } else if (Arrays.stream(numbers[i]).allMatch(n -> n % 2 == 1)) {
                System.out.printf("R%d: All numbers are odd.%n", i);
            }

            // Check columns
            if (numbers[0][i] % 2 == 0 && numbers[1][i] % 2 == 0 && numbers[2][i] % 2 == 0) {
                System.out.printf("C%d: All numbers are even.%n", i);
            } else if (numbers[0][i] % 2 == 1 && numbers[1][i] % 2 == 1 && numbers[2][i] % 2 == 1) {
                System.out.printf("C%d: All numbers are odd.%n", i);
            }
        }
    }
}
