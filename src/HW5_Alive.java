/*
 * TITLE: Homework Set 5 - Alive
 * NAME: James Tung
 * DATE: 9/17/2023
 * DESCRIPTION: Assuming a sleep duration of 8 hours, calculate the number of hours the user has been asleep compared to the number of days the user has been alive.
 */

import java.util.Scanner;

public class HW5_Alive {
    public static void main (String[] args) {
        System.out.println("Enter your birthday in the format MM/DD/YYYY:");
        Scanner sc = new Scanner(System.in); // create a new Scanner object for input
        String[] birthdate = sc.next().split("/"); // receive birthdate input and split it into an array
        System.out.println("Enter the current date in the format MM/DD/YYYY:");
        String[] currentDate = sc.next().split("/"); // receive current date input and split it into an array
        int days = (Integer.parseInt(currentDate[2]) - Integer.parseInt(birthdate[2])) * 365; // years to days
        days += (Integer.parseInt(currentDate[0]) - Integer.parseInt(birthdate[0])) * 30; // months to days
        days += (Integer.parseInt(currentDate[1]) - Integer.parseInt(birthdate[1])); // remaining days
        System.out.println("You have been alive for " + days + " days.");
        System.out.println("You have been asleep for " + (days * 8) + " hours.");
    }
}
