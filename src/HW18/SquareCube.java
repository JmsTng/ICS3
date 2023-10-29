/*
 * TITLE: Homework Set 18 - SquareCube
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION: Loop X times and add the square and cube of each loop# to a sum, where X is provided by the user.
 */

import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int n;
        int squares = 0;
        int cubes = 0;

        // Read input
        System.out.print("Upper limit: ");
        for (n = sc.nextInt(); n > 0; n--) {
            squares += n * n;
            cubes += n * n * n;
        }

        // Print sum
        System.out.println("The sum of squares is " + squares + ".");
        System.out.println("The sum of cubes is " + cubes + ".");
    }
}
