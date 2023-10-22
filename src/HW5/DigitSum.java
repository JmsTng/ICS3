/*
 * TITLE: Homework Set 5 - Digit Sum
 * NAME: James Tung
 * DATE: 9/17/2023
 * DESCRIPTION: Given a number, output the number along with the sum of its digits.
 */

import java.util.Scanner;

public class DigitSum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        String num = sc.next();
        int sum = 0;
        char[] digits = num.toCharArray();

        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(digits[i]));
        }
        System.out.println("Number: " + num);
        System.out.println("Sum of digits: " + sum);
    }
}
