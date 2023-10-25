/*
 * TITLE: Homework Set 14 - Age
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Ask the user to guess a constant secret number (my age) until they guess it correctly.
 */

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SECRET = 15;
        int guess = 0;

        // Prompt user for input
        while (guess != SECRET) {
            System.out.print("Guess my age: ");
            guess = sc.nextInt();
            if (guess != SECRET) {
                System.out.println("Nope!");
            }
        }

        System.out.println("That's correct!");
    }
}
