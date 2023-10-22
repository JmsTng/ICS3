/*
 * TITLE: Homework Set 4 - Problem 4
 * NAME: James Tung
 * DATE: 09/16/2023
 * DESCRIPTION: Ask the user for two words. Output the words on separate lines, and then as one line separated by a tab.
 */

import java.util.Scanner;

public class Input_4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next();
        String secondWord = sc.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(firstWord + "\t" + secondWord);
    }
}
