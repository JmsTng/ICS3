/*
 * TITLE: Homework Set XX - Square
 * NAME: James Tung
 * DATE: 11/25/2023
 * DESCRIPTION: Uses method overloading to print a square of a specified size, optionally with a different character.
 */

package BONUS;

public class Square {
    public static void main(String[] args) {
        square(5);
        square(5, '!');
    }

    /**
     * void square(int n)
     * Prints an n*n square of the '@' character.
     * @param n The size of the square.
     */
    public static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    /**
     * void square(int n, char c)
     * Prints an n*n square with character c.
     * @param n The size of the square.
     * @param c The character to print.
     */
    public static void square(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
