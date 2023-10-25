/*
 * TITLE: Homework Set 13 - Food Menu
 * AUTHOR: James Tung
 * DATE: 10/14/2023
 * DESCRIPTION: Provide a numbered menu, and allow the user to make a selection. Output the price if the input is valid.
 */
 
 import java.util.Scanner;
 
 public class FoodOrder {
 	public static void main(String[] args) {
		// Initialization
		Scanner sc = new Scanner(System.in);
		String selection;
		
		// Assignments
		System.out.println("MENU:\n1) juice + muffin + coffee\n2) cereal + toast + milk\n3) egg + toast + coffee\n4) banana + granola + milk\n5) grapefruit + bacon + eggs + coffee");
		System.out.print("Please choose a meal number: ");
		selection = sc.next();
		
		// Logic
		switch (selection) {
			case "1" -> System.out.println("You selected menu option #1 (juice + muffin + coffee). That'll be $2.50.");
			case "2" -> System.out.println("You selected menu option #2 (cereal + toast + milk). That'll be $2.50.");
			case "3" -> System.out.println("You selected menu option #3 (egg + toast + coffee). That'll be $3.00.");
			case "4" -> System.out.println("You selected menu option #4 (banana + granola + milk). That'll be $3.50.");
			case "5" -> System.out.println("You selected menu option #5 (grapefruit + bacon + eggs + coffee). That'll be $5.00.");
			default -> System.out.println("Sorry, it doesn't look like we have that on the menu.");
		}
	}
}