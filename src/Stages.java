/*
 * TITLE: Homework Set 12 - Stages
 * AUTHOR: James Tung
 * DATE: 10/14/2023
 * DESCRIPTION: Given the input age, output a word describing the person's stage in life.
 */
 
 import java.util.Scanner;
 
 public class Stages {
 	public static void main(String[] args) {
		// Initialize
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an age: ");
		int age = sc.nextInt();
		
		// Output
		if (age <= 18) {
			if (age <= 5) System.out.println("toddler");
			elif (age <= 10) System.out.println("child");
			elif (age <= 12) System.out.println("preteen");
			else System.out.println("teen");
		} else System.out.println("adult");
	}
}