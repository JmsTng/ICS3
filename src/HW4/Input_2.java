/*
 * TITLE: Homework Set 4 - Problem 2
 * NAME: James Tung
 * DATE: 09/16/2023
 * DESCRIPTION: Asks for the user's name, and then outputs it.
 */

import java.util.Scanner;

public class Input_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();

        System.out.printf("Hello %s.", name);
    }
}
