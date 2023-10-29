/*
 * TITLE: Homework Set 18 - Limit
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION: Loop X times and add 1/loop# to a sum, where X is provided by the user.
 */

import java.util.Scanner;

public class Limit {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;

        // Read input X times
        System.out.print("Enter a limit: ");
        for (n = sc.nextInt(); n > 0; n--) {
            sum += 1.0 / n;
        }

        // Print sum
        System.out.println("The sum is " + sum + ".");
    }
}
