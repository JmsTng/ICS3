/*
 * TITLE: Homework Set 20 - Numbers
 * AUTHOR: James Tung
 * DATE: 10/14/2023
 * DESCRIPTION:
 */

package HW20;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMBERS = 6;
        double[] numbers = new double[NUMBERS];

        for (int i = 0; i < NUMBERS; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = sc.nextDouble();
        }
    }
}
