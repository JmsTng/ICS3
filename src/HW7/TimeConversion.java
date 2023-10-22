/*
 * TITLE: Homework Set 7 - Time Conversion
 * NAME: James Tung
 * DATE: 9/23/2023
 * DESCRIPTION: Given the number of minutes, output the number of hours and minutes.
 */

import java.util.Scanner;

public class TimeConversion {
    public static void main (String[] args) {
        System.out.println("Enter the number of minutes:");
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.printf("That's %d:%02d hours.\n", hours, remainingMinutes);
    }
}
