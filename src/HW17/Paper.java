/*
 * TITLE: Homework Set 17 - Paper
 * NAME: James Tung
 * DATE: 10/25/2023
 * DESCRIPTION: Print the thickness and area of a piece of paper folded in half 40 times.
 */

public class Paper {
    public static void main(String[] args) {
        // Initialize variables
        double thickness = 0.09;
        double area = 1;

        // Loop
        for (int i = 1; i <= 40; i++) {
            // Update area and thickness
            area /= 2;
            thickness *= 2;

            // Print area and thickness
            System.out.printf("%-2d - Area: %.20fm^2 Thickness: %.2fmm\n", i, area, thickness);
        }
    }
}
