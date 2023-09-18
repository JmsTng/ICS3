/*
 * TITLE: Homework Set 5 - Fastfood Cost
 * NAME: James Tung
 * DATE: 9/17/2023
 * DESCRIPTION: Given the number of burgers, fries, and sodas, calculate the total cost of the order.
 */

import java.util.Scanner;

public class HW5_Fastfood {
    public static void main (String[] args) {
        System.out.println("Enter the number of burgers:");
        int burgers = new Scanner(System.in).nextInt(); // Read the number of burgers
        System.out.println("Enter the number of fries:");
        int fries = new Scanner(System.in).nextInt(); // Read the number of fries
        System.out.println("Enter the number of sodas:");
        int sodas = new Scanner(System.in).nextInt(); // Read the number of sodas
        // Set the prices of each item as constants
        final double burgerPrice = 1.69;
        final double friesPrice = 1.09;
        final double sodaPrice = 0.99;

        double subtotal = (burgers * burgerPrice + fries * friesPrice + sodas * sodaPrice);
        double total = subtotal * 1.13;

        System.out.println("The subtotal is $" + subtotal + ".");
        System.out.println("The tax (13%) is $" + subtotal * 0.13 + ".");
        System.out.println("The total is $" + total + ".");
    }
}
