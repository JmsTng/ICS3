/*
 * TITLE: Homework Set 11A - Test Scores
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION: Prompt the user (a teacher) to enter a test mark. Output whether the mark is in bounds or not, and if it is, output whether the student passed or failed.
 */

package HW11A;

import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        // Prompt for mark
        System.out.print("Enter a test mark: ");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        // Check if mark is in bounds
        if (mark < 0) {
            System.out.println("The mark is out of bounds (below zero).");
        } else if (mark > 100) {
            System.out.println("The mark is out of bounds (above 100).");
        } else {
            // Output whether student passed or failed
            if (mark >= 50) {
                System.out.println("The student passed.");
            } else {
                System.out.println("The student failed.");
            }
        }
    }
}
