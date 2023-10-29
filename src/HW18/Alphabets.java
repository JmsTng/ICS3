/*
 * TITLE: Homework Set 18 - Alphabets
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION: Continually read a letter from the user and print the number of uppercase letters, lowercase letters, and vowels once a non-alphabetic character is entered.
 */

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        char c;
        char cLower;
        int upper = 0;
        int lower = 0;
        int vowels = 0;

        // Read input and loop until non-alphabetic character is provided
        System.out.print("Enter a letter: ");
        while (Character.isAlphabetic(c = sc.next().charAt(0))) { // Assignment and check
            if (Character.isUpperCase(c)) { // If alphabetic and uppercase, increment upper
                upper++;
            } else { // If alphabetic and not uppercase, increment lower
                lower++;
            }

            // If alphabetic and vowel, increment vowels
            cLower = Character.toLowerCase(c); // Convert to lowercase for comparison
            if (cLower == 'a' || cLower == 'e' || cLower == 'i' || cLower == 'o' || cLower == 'u') {
                vowels++;
            }

            // Read input
            System.out.print("Enter a letter: ");
        }
        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("Vowels: " + vowels);
    }
}
