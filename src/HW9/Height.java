/*
 * TITLE: Homework Set 9 - Height
 * NAME: James Tung
 * DATE: 10/1/2023
 * DESCRIPTION: Ask for the height of a person in feet and inches. Output the height in centimeters.
 */

import java.util.Scanner;

public class Height {
    public static void main (String[] args) {
        // Declare constants
        final double CM_PER_INCH = 2.54;
        final double INCH_PER_FOOT = 12;
        int feet, inches;
        double height;

        // Read input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height either in feet and inches or just in centimetres (eg. 5'0\" or 60): ");
        String input = sc.nextLine();
        if (input.contains("'")) {
            // If input contains feet and inches
            // Split input into feet and inches
            String[] split = input.split("'");
            feet = Integer.parseInt(split[0]);
            inches = Integer.parseInt(split[1].replace("\"", "")) + (int) (feet * INCH_PER_FOOT);
        } else {
            // If input contains only inches
            inches = Integer.parseInt(input.replace("\"", ""));
        }

        // Calculate height in centimeters
        height = inches * CM_PER_INCH;

        // Output height in centimeters
        System.out.printf("Height in centimeters: %.2f", height);
    }
}
