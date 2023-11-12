/*
 * TITLE: Homework Set 23 - Star Table
 * NAME: James Tung
 * DATE: 11/12/2023
 * DESCRIPTION: Create a table of stars with dimensions provided by the user.
 */

package HW23;

import java.util.Scanner;

public class StarTable {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int x, y;
        String[] dimensions;
        char[][] table;

        // Read input
        System.out.print("Enter the dimensions of the table (eg. 5 x 8): ");
        dimensions = sc.nextLine().split(" x ");
        x = Integer.parseInt(dimensions[0]);
        y = Integer.parseInt(dimensions[1]);

        // Create 2D array
        table = new char[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++)
                table[i][j] = '*';
        }

        // Output table
        for (char[] row : table) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
