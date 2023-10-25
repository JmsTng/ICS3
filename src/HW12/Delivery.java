/*
 * TITLE: Homework Set 12 - Delivery
 * AUTHOR: James Tung
 * DATE: 10/14/2023
 * DESCRIPTION: Given the weight and size of a package, output the cost, or an error message if the inputs are invalid.
 */
 
 import java.util.Scanner;
 
 public class Delivery {
 	public static void main(String[] args) {
		// Initialization
		Scanner sc = new Scanner(System.in);
		int weight;
		int l = 0, w = 0, h = 0;
		double price;
		String[] dimensions;
		
		// Read inputs
		System.out.print("Enter the weight of your package in kilograms: ");
		weight = sc.nextInt();
		
		System.out.print("Enter the dimensions of your package in cm (eg. 10x10x10): ");
		dimensions = sc.nextLine().split("x");
		for (int i = 0; i < dimensions.length; i++) { // does this work??
			if (i == 0) l = Integer.parseInt(dimensions[i]);
			if (i == 1) w = Integer.parseInt(dimensions[i]);
			if (i == 2) h = Integer.parseInt(dimensions[i]);
		} // 100% not going to work first try...
		
		// Logic
		if (l*w*h > 100000) {
			System.out.println("Unfortunately, your package does not meet our shipping requirements.\n-- Package too large --");
		} else if (weight > 27) {
			System.out.println("Unfortunately, your package does not meet our shipping requirements.\n-- Package too heavy --");
		} else {
			if (weight <= 5) {
				price = weight * 3;
			} else if (weight <= 12) {
				price = weight * 3.5;
			} else if (weight <= 20) {
				price = weight * 4;
			} else {
				price = weight * 4.5;
			}
			
			System.out.printf("Your package will cost $%.2f to deliver. Thank you for choosing Jackson Delivery.", price);
		}
	}
}