/*
 * TITLE: Homework Set 14 - PercentPassing
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Ask the user to enter a series of test scores until they enter a negative number. Then, print the percentage of scores that are passing (> 70).
 */

import java.util.Scanner;

public class PercentPassing {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int passing = 0;
        int total = 0;

        // Prompt user for input
        while (score >= 0) {
            System.out.print("Enter a test score: ");
            score = sc.nextInt();
            if (score >= 0) {
                total++;
                if (score > 70) {
                    passing++;
                }
            }
        }

        // Print results
        System.out.println("Percentage of passing scores: " + (passing * 100 / total) + "%");
    }
}
