/*
 * TITLE: Homework Set 5 - Drop Height
 * NAME: James Tung
 * DATE: 09/17/2023
 * DESCRIPTION: Given a time in seconds and an initial height of 100 meters, calculate the height of the falling object after the given time has elapsed.
 */

import java.util.Scanner;

public class HW5_Drop {
    public static void main (String[] args) {
        System.out.println("Enter a time less than 4.5 seconds:");
        double time = new Scanner(System.in).nextDouble();
        System.out.println("The height of the object is " + (100 - 4.9 * time * time) + " meters."); // Use the formula h = 100 - 4.9t^2
    }
}
