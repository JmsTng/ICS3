/*
 * TITLE: Homework Set 12 - Sort Three Numbers
 * AUTHOR: James Tung
 * DATE: 10/14/2023
 * DESCRIPTION: Given three positive numbers, output them in ascending order (if inputs are valid)
 */

import java.util.Scanner;

public class SortThreeNum {
	public static void main(String[] args) {
		// Initialize
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		// Read input
		System.out.print("First number: ");
		num1 = sc.nextInt();
		System.out.print("Second number: ");
		num2 = sc.nextInt();
		System.out.print("Third number: ");
		num3 = sc.nextInt();
		
		// Checks
		if (num1 > 0 && num2 > 0 && num3 > 0) { // Inputs are valid
			if (num1 < num2 && !(num3 < num1)) { // Number1 is the smallest value
				System.out.print(num1 + " ");
				if (num2 < num3) {
					System.out.println(num2 + " " + num3);
				} else {
					System.out.println(num3 + " " + num2);
				}
			} else {
				if (num2 < num1 && !(num3 < num2)) {
					System.out.print(num2 + " ");
					if (num1 < num3) {
						System.out.println(num1 + " " + num3);
					} else {
						System.out.println(num3 + " " + num1);
					}
				} else {
					System.out.print(num3 + " ");
					if (num1 < num2) {
						System.out.println(num1 + " " + num2);
					} else {
						System.out.println(num2 + " " + num1);
					}
				}
			}
		}
	}
}