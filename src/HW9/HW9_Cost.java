/*
 * TITLE: Homework Set 9 - Cost
 * NAME: James Tung
 * DATE: 10/1/2023
 * DESCRIPTION: Ask for the price of an item and the number of bags. Output tax, bag cost, and total cost of the item.
 */

import java.util.Scanner;

public class HW9_Cost {
    public static void main (String[] args) {
        // Declare constants
        final double HST = 0.13;
        final double BAG_COST = 0.05;

        // Read input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the item: $");
        double price = sc.nextDouble();
        System.out.print("Enter the number of bags: ");
        int bags = sc.nextInt();

        // Calculate tax, bag cost, and total cost
        double tax = price * HST;
        double bagCost = bags * BAG_COST;
        double totalCost = price + tax;

        // Output tax, bag cost, and total cost
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Bag cost: $%.2f\n", bagCost);
        System.out.printf("Total item cost: $%.2f\n", totalCost);
        System.out.println("-".repeat(20));
        System.out.printf("Total cost: $%.2f", (totalCost + bagCost));
    }
}
