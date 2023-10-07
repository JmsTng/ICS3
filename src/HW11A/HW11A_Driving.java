/*
 * TITLE: Homework Set 11A - Driving
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION: Prompt the user for their age. If they 18 <= age <= 75, output age and message. If not, output age and whether the user is above or below the age range.
 */

package HW11A;

import java.util.Scanner;

public class HW11A_Driving {
    public static void main (String[] args) {
        // Prompt user for age
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Check if user is old enough to drive
        if (age >= 18 && age <= 75) {
            System.out.printf("%d years old? Age OK. Have you got a driver's license?", age);
        } else if (age > 75) {
            System.out.printf("Sorry, %d is above the legal age limit for driving.", age);
        } else {
            System.out.printf("%d is too young to drive.", age);
        }
    }
}
