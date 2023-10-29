/*
 * TITLE: Homework Set XX - PythagoreanTriples
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION:
 */

import java.util.Scanner;

public class PythagoreanTriples {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int limit;

        // Read input
        System.out.print("Enter the limit: ");
        limit = sc.nextInt();

        // Print triples
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                for (int c = b; c <= limit; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.printf("%d, %d, %d%n", a, b, c);
                    }
                }
            }
        }
    }
}
