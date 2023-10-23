/*
 * TITLE: Homework Set 11 - Discriminant
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION: Given a, b, and c, output the number of roots. (b^2 - 4ac)
 */

package HW11;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        // Prompt user for a, b, and c
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // Calculate discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // Output number of roots
        if (discriminant > 0) {
            System.out.println("There are two roots.");
        } else if (discriminant == 0) {
            System.out.println("There is one root.");
        } else {
            System.out.println("There are no roots.");
        }
    }
}
