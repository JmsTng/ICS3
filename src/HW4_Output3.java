/*
 * TITLE: Homework Set 4 - Problem 3
 * NAME: James Tung
 * DATE: 09/16/2023
 * DESCRIPTION: Asks for the user's name and age. Output name and age.
 */

import java.util.Scanner;

public class HW4_Output3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String age = sc.nextLine();
        System.out.printf("Hello %s. You are %s years old.", name, age);
    }
}
