/*
 * TITLE: Homework Set 7 - Simple Interest Amount
 * NAME: James Tung
 * DATE: 9/23/2023
 * DESCRIPTION: Given the principal, interest rate, and number of years, calculate the simple interest amount.
 */

import java.util.Scanner;

public class SimpleInterestAmount {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, interestRate, interestAmount;
        int years;

        System.out.println("Enter the principal:");
        principal = sc.nextDouble();
        System.out.println("Enter the interest rate:");
        interestRate = sc.nextDouble();
        System.out.println("Enter the number of years:");
        years = sc.nextInt();
        interestAmount = principal * ((interestRate / 100) * years + 1); // A = P(1+rt)
        System.out.printf("The simple interest amount is $%.2f.\n", interestAmount);
    }
}
