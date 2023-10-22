/*
 * TITLE: Homework Set 9 - Currency
 * NAME: James Tung
 * DATE: 10/1/2023
 * DESCRIPTION: Ask for the amount of money in US dollars. Output the amount of money in Canadian dollars.
 */

import java.util.Scanner;

public class Currency {
    public static void main (String[] args) {
        // Declare constants
        final double CAD_PER_USD = 1.35;

        // Declare variables
        double usd, cad;

        // Read input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of money in US dollars: $");
        usd = sc.nextDouble();

        // Calculate amount of money in Canadian dollars
        cad = usd * CAD_PER_USD;

        // Output amount of money in Canadian dollars
        System.out.printf("Amount of money in Canadian dollars: $%.2f", cad);
    }
}
