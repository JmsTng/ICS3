/*
 * TITLE: Homework Set 14 - Count Three
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Create a while loop that counts from a user-specified number to another user-specified number by 1s.
 */

import java.util.Scanner;

public class Count3 {
    public static void main(String[] args) {
        // Initialization
        Scanner sc = new Scanner(System.in);
        int a, b;

        // Get user input
        System.out.print("Enter a starting number: ");
        a = sc.nextInt();
        System.out.print("Enter an ending number: ");
        b = sc.nextInt();

        // Loop until a is greater than b
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
}
