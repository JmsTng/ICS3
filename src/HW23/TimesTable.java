/*
 * TITLE: Homework Set 23 - Times Table
 * NAME: James Tung
 * DATE: 11/12/2023
 * DESCRIPTION:
 */

package HW23;

public class TimesTable {
    public static void main(String[] args) {
        // Initialize variables
        final int SIZE = 12;
        int[][] table = new int[SIZE][SIZE];

        // Create 2D array
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE; j++)
                table[i-1][j-1] = i * j;
        }

        // Output table
        System.out.print("    ");
        for (int i = 1; i <= SIZE; i++) { // Header row
            System.out.printf("%-4d", i);
        }
        for (int i = 0; i < SIZE; i++) { // Body
            System.out.printf("%n%-4d", i + 1); // Header column
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%-4d", table[i][j]);
            }
        }
    }
}
