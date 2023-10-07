/*
 * TITLE: Homework Set 5 - Averages
 * NAME: James Tung
 * DATE: 09/17/2023
 * DESCRIPTION: Read three doubles and output the average.
 */

import java.util.Scanner;

public class HW5_Average {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        // Read three doubles
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.println((num1 + num2 + num3) / 3);
    }
}
