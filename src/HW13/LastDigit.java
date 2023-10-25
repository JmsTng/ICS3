/*
 * TITLE: Homework Set 13 - Last Digit
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Output the last digit of a number as a word.
 */

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        // Initialization
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int lastDigit;

        // Logic
        lastDigit = num % 10;
        String word = switch (lastDigit) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "Invalid number";
        };

        // Output
        if (word.equals("Invalid number")) {
            System.out.println("Invalid number");
        } else {
            System.out.printf("The last digit of %d is %s.", num, word);
        }
    }
}
