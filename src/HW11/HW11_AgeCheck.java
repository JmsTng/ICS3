/*
 * TITLE: Homework Set 11 - Age Check
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION:  Prompt the user for their age. If they are 18 or older, state that they are old enough to vote. If not, output the number of years until they can vote.
 */

import java.util.Scanner;

public class HW11_AgeCheck {
    public static void main (String[] args) {
        // Prompt user for age
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Check if user is old enough to vote
        if (age >= 18) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.printf("You can vote in %d years.", 18 - age);
        }
    }
}
