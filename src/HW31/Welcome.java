/*
 * TITLE: Homework Set 31 - Welcome
 * NAME: James Tung
 * DATE: 11/24/2023
 * DESCRIPTION: Prints a welcome message with the name and visitor number.
 */

package HW31;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String name;
        int visitorNum;

        // Get user input
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your visitor number: ");
        visitorNum = sc.nextInt();

        // Print welcome message
        System.out.println(welcomeMessage(name, visitorNum));
    }

    /**
     * String welcomeMessage(String name, int visitorNum)
     * Returns a welcome message with the name and visitor number.
     * @param name The name of the visitor.
     * @param visitorNum The visitor's number.
     * @return A welcome message with the name and visitor number.
     */
    public static String welcomeMessage(String name, int visitorNum) {
        String res = "Welcome %s! You are visitor number %d.".formatted(name, visitorNum);
        return res;
    }
}
