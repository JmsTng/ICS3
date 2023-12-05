/*
 * TITLE: Homework Set XX - PerfectSquare
 * NAME: James Tung
 * DATE: 11/24/2023
 * DESCRIPTION: Returns whether the number is a perfect square.
 */

package BONUS;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(perfectSquare(25));
        System.out.println(perfectSquare(26));
    }

    /**
     * boolean perfectSquare(int num)
     * Returns a boolean stating whether the number is a perfect square or not.
     * @param num The potential perfect square.
     * @return Whether the number is a perfect square.
     */
    public static boolean perfectSquare(int num) {
        boolean isPerfectSquare = false;

        if (num < 0) {
            System.out.println("Error: Invalid number.");
        } else {
            if (Math.sqrt(num) % 1 == 0) {
                isPerfectSquare = true;
            }
        }
        return isPerfectSquare;
    }
}
