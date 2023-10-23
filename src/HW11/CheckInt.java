/*
 * TITLE: Homework Set 11 - Check Integer
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION: Prompt the user for an integer. Check the integer against a number of criterion.
 */

package HW11;

import java.util.Scanner;

public class CheckInt {
    public static void main(String[] args) {
        // Prompt user for number
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = num + " "; // String to store result output

        // Check whether number is negative or positive
        if (num < 0) {
            result += "is negative, ";
        } else if (num > 0) {
            result += "is positive, ";
        } else {
            System.out.println(result + " is zero.");
            return;
        }

        // Check whether number is even or odd
        if (num % 2 == 0) {
            result += "even, ";
        } else {
            result += "odd, ";
        }

        // Check whether number is a multiple of 7
        if (num % 7 == 0) {
            result += "and a multiple of 7.";
        } else {
            result += "and not a multiple of 7.";
        }

        // Output result
        System.out.println(result);
    }
}
