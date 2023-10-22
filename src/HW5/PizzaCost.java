/*
 * TITLE: Homework Set 5 - The Cost of Pizza
 * NAME: James Tung
 * DATE: 9/17/2023
 * DESCRIPTION: Given the size of pizza in inches, add on the rent and labour costs to calculate the total cost of the pizza.
 */

import java.util.Scanner;

public class PizzaCost {
    public static void main (String[] args) {
        System.out.println("Enter the size of the pizza in inches:");
        double size = new Scanner(System.in).nextDouble(); // Read the size of the pizza
        // Set the rent and labour costs as constants
        final double RENT = 1.0;
        final double LABOUR = 0.75;

        System.out.println("The total cost of the pizza is $" + (0.05 * size * size + LABOUR + RENT) + "."); // Use the formula cost = 0.05 * size^2 + labour + rent
    }
}
