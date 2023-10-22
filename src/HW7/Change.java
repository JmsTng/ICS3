/*
 * TITLE: Homework Set 7 - Change
 * NAME: James Tung
 * DATE: 9/23/2023
 * DESCRIPTION: Given the amount of change in cents, calculate the minimum number of coins needed to make the change.
 */

import java.util.Scanner;

public class Change {
    public static void main (String[] args) {
        System.out.println("Enter the value in cents: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        // calculate the number of each coin in descending order
        int[] toonies = changePerCoin(amount, 200); // toonies
        int[] loonies = changePerCoin(toonies[1], 100); // loonies
        int[] quarters = changePerCoin(loonies[1], 25); // quarters
        int[] dimes = changePerCoin(quarters[1], 10); // dimes
        int[] nickels = changePerCoin(dimes[1], 5); // nickels

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
