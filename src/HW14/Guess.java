/*
 * TITLE: Homework Set 14 - Guess
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: In a while loop, allow the user to guess a constant secret number until they guess it correctly, or they guess out of range.
 */

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SECRET = (int) (Math.random() * 20);
        int guess = SECRET == 0 ? 1 : 0;

        // Prompt user for input
        while (guess != SECRET || !(guess < 0 || guess > 20)) {
            System.out.print("Guess a number between 0 and 20: ");
            guess = sc.nextInt();
            if (guess != SECRET) {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("You got it!");
    }
}
