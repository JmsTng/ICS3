/*
 * TITLE: Homework Set 7 - Spending
 * NAME: James Tung
 * DATE: 9/23/2023
 * DESCRIPTION: Given the amount spent in each category, output the percentage of the total spent in each category.
 */

import java.util.Scanner;

public class HW7_Spending {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount spent in the following categories:");
        System.out.print(" - Food: $");
        double food = sc.nextInt();
        System.out.print(" - Clothing: $");
        double clothing = sc.nextInt();
        System.out.print(" - Entertainment: $");
        double entertainment = sc.nextInt();
        System.out.print(" - Rent: $");
        double rent = sc.nextInt();
        double total = food + clothing + entertainment + rent;
        System.out.println("Category" + " ".repeat(10) + "Percentage");
        System.out.printf("Food%23.2f%%", 100 * food/total);
        System.out.printf("\nClothing%19.2f%%", 100 * clothing/total);
        System.out.printf("\nEntertainment%14.2f%%", 100 * entertainment/total);
        System.out.printf("\nRent%23.2f%%", 100 * rent/total);
    }
}
