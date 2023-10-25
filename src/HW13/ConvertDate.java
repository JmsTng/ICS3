/*
 * TITLE: Homework Set 13 - Convert Date
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Given numerical input for the day, month, and year, output the date in the format "Month Day, Year"
 */

import java.util.Scanner;

public class ConvertDate {
    public static void main(String[] args) {
        // Initialization
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        String wordMonth;

        // Read input
        System.out.print("Enter the year: ");
        year = sc.nextInt();
        System.out.print("Enter the month: ");
        month = sc.nextInt();
        System.out.print("Enter the day: ");
        day = sc.nextInt();

        // Logic
        wordMonth = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };

        if (wordMonth.equals("Invalid month")) {
            System.out.println("Invalid month");
            return;
        }

        // Output
        System.out.printf("%s %d, %d", wordMonth, day, year);
    }
}
