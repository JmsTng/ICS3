/*
 * TITLE: Homework Set 15 - Count One
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Use a do-while loop to count down from 100 to 0 by 2's.
 */

package HW15;

public class Count1 {
    public static void main(String[] args) {
        // Initialize counter
        int i = 100;

        // Count down by 2's
        do {
            System.out.println(i);
            i -= 2;
        } while (i > 0);
    }
}
