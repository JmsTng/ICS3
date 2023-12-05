/*
 * TITLE: Homework Set 30 - Divide Seventeen
 * NAME: James Tung
 * DATE: 11/14/2023
 * DESCRIPTION: Join two numbers and divide by 17.
 */

package HW30;

import java.util.Scanner;

public class Divide17 {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String num;

        // Get input
        System.out.print("Enter a number: ");
        num = sc.nextLine();
        System.out.print("Enter another number: ");
        num += sc.nextLine();

        // Divide by 17
        System.out.printf("%s divided by 17 is %.2f", num, Integer.parseInt(num) / 17.0);
    }
}
