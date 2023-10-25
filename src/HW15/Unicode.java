/*
 * TITLE: Homework Set 15 - Unicode
 * NAME: James Tung
 * DATE: 10/24/2023
 * DESCRIPTION: Use a do-while loop to print the Unicode characters from 1 to 212.
 */

public class Unicode {
    public static void main(String[] args) {
        // Initialize counter
        int i = 1;

        // Console setup
        System.out.printf("%-10s%s\n", "Unicode", "Character");
        System.out.println("--------- ---------");

        // Print Unicode characters
        do {
            System.out.printf("%-10d%c\n", i, (char) i); // Cast i to char to print the character
            i++;
        } while (i <= 212);
    }
}
