/*
 * TITLE: Homework Set 11 - Salary
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION: Given the base salary and number of sales, output the total salary.
 */

import java.util.Scanner;

public class Salary {
    public static void main (String[] args) {
        // Prompt user for base salary and number of sales
        System.out.print("Enter your number of sales: ");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();

        // Check if sales > 10
        if (sales >= 10) {
            // Output total salary
            int commission = 10 * sales;
            System.out.printf("Your total salary is $%d.", 1000 + commission);
            return;
        }

        // Output total salary (if sales <= 10)
        System.out.print("Your total salary is $1000.");
    }
}
