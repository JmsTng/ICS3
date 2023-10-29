/*
 * TITLE: Homework Set XX - TableOfNumbers
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION:
 */

import java.util.Scanner;

public class TableOfNumbers {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int x, y;

        // Read input
        System.out.print("Enter the number of rows: ");
        y = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        x = sc.nextInt();

        // Print table
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
