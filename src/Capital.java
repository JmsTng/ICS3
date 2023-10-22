/*
 * TITLE: Homework Set 12 - Capital
 * AUTHOR: James Tung
 * DATE: 10/14/2023
 * DESCRIPTION: Prompt the user for the capital of Canada. Respond with whether the user was correct or not.
 */
 
 import java.util.Scanner;
 
 public class Capital {
 	public static void main(String[] args) {
		// Initialization
		Scanner sc = new Scanner(System.in);
		
		// Logic
		System.out.print("Please input the capital of Canada: ");
		switch (sc.nextLine().strip().toLowerCase()) {
			case "ottawa" -> System.out.println("That's correct!");
			default -> System.out.println("Better luck next time! The answer was: Ottawa");
		}
	}
}