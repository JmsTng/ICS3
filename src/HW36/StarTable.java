/*
 * TITLE: Homework Set 36 - Star Table
 * NAME: James Tung
 * DATE: 12/7/2023
 * DESCRIPTION: This program creates a table of stars with the dimensions specified by the user and outputs it to a file.
 */

package HW36;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StarTable {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        char[][] table;

        // Collect input
        try {
            System.out.print("Enter number of rows: ");
            rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            cols = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Expecting integer.");
            return;
        }

        // Create table
        table = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table[i][j] = '*';
            }
        }

        // Output to file
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("out/starTable.txt"));
            for (int i = 0; i < rows; i++) {
                file.write(String.valueOf(table[i]));
                file.write("\n");
            }

            file.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
