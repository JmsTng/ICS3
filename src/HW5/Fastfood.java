/*
 * TITLE: Homework Set 5 - Fastfood Cost
 * NAME: James Tung
 * DATE: 9/17/2023
 * DESCRIPTION: Given the number of burgers, fries, and sodas, calculate the total cost of the order.
 */

import java.util.Scanner;

public class Fastfood {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        int burgers, fries, sodas;
        double subtotal, total, payment, change;
        // Set the prices of each item as constants
        final double BURGER_PRICE = 1.69;
        final double FRIES_PRICE = 1.09;
        final double SODA_PRICE = 0.99;


        System.out.println("Enter the number of burgers:");
        burgers = sc.nextInt(); // Read the number of burgers
        System.out.println("Enter the number of fries:");
        fries = sc.nextInt(); // Read the number of fries
        System.out.println("Enter the number of sodas:");
        sodas = sc.nextInt(); // Read the number of sodas

        subtotal = (burgers * BURGER_PRICE + fries * FRIES_PRICE + sodas * SODA_PRICE);
        total = subtotal * 1.13;

        System.out.printf("The subtotal is $%.2f.\n", subtotal);
        System.out.printf("The tax (13%%) is $%.2f.\n", subtotal * 0.13);
        System.out.printf("The total is $%.2f.\n", total);

        // Payment
        System.out.println("Enter your payment:");
        payment = sc.nextDouble();
        change = payment - total;
        System.out.printf("Your change is $%.2f.%n", change);
    }
}
