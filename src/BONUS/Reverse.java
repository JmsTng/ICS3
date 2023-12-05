/*
 * TITLE: Homework Set XX - Reverse
 * NAME: James Tung
 * DATE: 11/24/2023
 * DESCRIPTION: Returns the reverse of a string.
 */

package BONUS;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("Hello, world!"));
    }

    /**
     * String reverse(String str)
     * Returns the reverse of a string.
     * @param str The string to reverse.
     * @return The reverse of the string.
     */
    public static String reverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}
