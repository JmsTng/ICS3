/*
 * TITLE: Homework Set XX - Rectangle
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION:
 */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int height, width;

        // Read input
        System.out.print("Enter the number of rows: ");
        height = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        width = sc.nextInt();

        // Print rectangle
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
