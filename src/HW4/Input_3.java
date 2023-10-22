/*
 * TITLE: Homework Set 4 - Problem 3
 * NAME: James Tung
 * DATE: 09/16/2023
 * DESCRIPTION: Asks for the user's name and age. Output name and age.
 */

import java.util.Scanner;

public class Input_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your age?");
        String age = sc.nextLine();

        System.out.printf("Hello %s. You are %s years old.", name, age);
    }
}
