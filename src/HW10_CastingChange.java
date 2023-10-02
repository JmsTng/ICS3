/*
 * TITLE: Homework Set 10 - Change (using casting)
 * NAME: James Tung
 * DATE: 10/1/2023
 * DESCRIPTION: Read a number of dollars and output the number of quarters, dimes, nickels, and pennies.
 */

import java.util.Scanner;

public class HW10_CastingChange {
    public static void main (String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of dollars: $");
        double dollars = sc.nextDouble();
        int cents = (int) (dollars * 100);

        // Calculate the number of each coin in descending order
        int[] toonies = changePerCoin((int) cents, 200); // toonies
        int[] loonies = changePerCoin(toonies[1], 100); // loonies
        int[] quarters = changePerCoin(loonies[1], 25); // quarters
        int[] dimes = changePerCoin(quarters[1], 10); // dimes
        int[] nickels = changePerCoin(dimes[1], 5); // nickels

        // Output the number of each coin
        System.out.println("The minimum number of coins is:");
        System.out.println(" - Toonies: " + toonies[0]);
        System.out.println(" - Loonies: " + loonies[0]);
        System.out.println(" - Quarters: " + quarters[0]);
        System.out.println(" - Dimes: " + dimes[0]);
        System.out.println(" - Nickels: " + nickels[0]);
        System.out.println(" - Unchanged coins: " + nickels[1]);
    }

    public static int[] changePerCoin (int amount, int denomination) {
        int[] result = new int[2];
        result[0] = amount / denomination; // number of coins that can be converted
        result[1] = amount % denomination; // amount of change left
        return result;
    }
}
