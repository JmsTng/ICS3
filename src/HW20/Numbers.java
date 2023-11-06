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

        for (int i = NUMBERS-1; i > 0; i--) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < NUMBERS; i++) {
            numbers[i] *= 1.1;
        }

        for (int i = 0; i < NUMBERS; i++) {
            if (numbers[i] > 50) {
                System.out.println(numbers[i]);
            }
        }
    }
}
