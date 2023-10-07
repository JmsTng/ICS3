/*
 * TITLE: Homework Set 7 - Simple Interest Principal
 * NAME: James Tung
 * DATE: 9/23/2023
 * DESCRIPTION: Given the simple interest amount, interest rate, and number of years, calculate the principal.
 */

import java.util.Scanner;

public class HW7_SimpleInterestPrincipal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount:");
        double interestAmount = sc.nextDouble();
        System.out.println("Enter the interest rate:");
        double interestRate = sc.nextDouble();
        System.out.println("Enter the number of years:");
        int years = sc.nextInt();
        double principal = interestAmount / ((interestRate / 100) * years + 1); // P = I / (rt + 1)
        System.out.printf("The principal is $%.2f.\n", principal);
    }
}
