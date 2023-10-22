/*
 * TITLE: Homework Set 10 - Average
 * NAME: James Tung
 * DATE: 10/1/2023
 * DESCRIPTION: Read five integers test scores and output the real average.
 */

import java.util.Scanner;

public class Average {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        // Read five integer test scores
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();
        int score4 = sc.nextInt();
        int score5 = sc.nextInt();

        // Calculate average
        // double average = (score1 + score2 + score3 + score4 + score5) / 5.0; // easy method
        double average = (float) (score1 + score2 + score3 + score4 + score5) / 5; // casting + division

        // Output average
        System.out.println(average);
    }
}
