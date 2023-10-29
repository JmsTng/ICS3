/*
 * TITLE: Homework Set 18 - Factors
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION: Print the factors of a number.
 */

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int n;

        // Read input
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // Print factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
