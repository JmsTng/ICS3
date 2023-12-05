/*
 * TITLE: Homework Set 33 - CheckLine
 * NAME: James Tung
 * DATE: 11/24/2023
 * DESCRIPTION: Returns whether two lines have the same length and slope using methods from Line.java.
 */

package HW33;

import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, x4, y4;

        // Get user input
        System.out.print("Enter the first point (x1 y1): ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("Enter the second point (x2 y2): ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.print("Enter the third point (x3 y3): ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.print("Enter the fourth point (x4 y4): ");
        x4 = sc.nextInt();
        y4 = sc.nextInt();

        // Print results
        System.out.println("Results:");
        if (Line.length(x1, y1, x2, y2) == Line.length(x3, y3, x4, y4)) { // Compare lengths
            System.out.println("The lines are the same length.");
        } else {
            System.out.println("The lines are not the same length.");
        }

        if (Line.slope(x1, y1, x2, y2) == Line.slope(x3, y3, x4, y4)) { // Compare slopes
            System.out.println("The lines have the same slope.");
        } else if (Line.slope(x1, y1, x2, y2) == -1 / Line.slope(x3, y3, x4, y4)) {
            System.out.println("The lines are perpendicular.");
        } else {
            System.out.println("The lines do not have the same slope.");
        }
    }
}
