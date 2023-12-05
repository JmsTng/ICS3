/*
 * TITLE: Homework Set XX - SameReverse
 * NAME: James Tung
 * DATE: 11/25/2023
 * DESCRIPTION: Returns whether the string is the same forwards and backwards.
 */

package BONUS;

public class SameReverse {
    public static void main(String[] args) {
        System.out.println(sameReverse("racecar"));
        System.out.println(sameReverse("hello"));
    }

    /**
     * boolean sameReverse(String str)
     * Returns whether the string is the same forwards and backwards.
     * @param str The string to check.
     * @return Whether the string is the same forwards and backwards.
     */
    public static boolean sameReverse(String str) {
        String reversed = Reverse.reverse(str);
        boolean isSameReverse = str.equals(reversed);
        return isSameReverse;
    }
}
