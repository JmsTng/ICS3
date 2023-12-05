/*
 * TITLE: Homework Set 31 - CalculateSum
 * NAME: James Tung
 * DATE: 11/24/2023
 * DESCRIPTION: Returns the sum of the numbers in a range.
 */

package HW31;

public class CalculateSum {
    public static void main(String[] args) {
        System.out.println(sumRange(1, 10));
    }

    /**
     * int sumRange(int start, int end)
     * Returns the sum of the numbers in a range.
     * @param start The starting number of the range.
     * @param end The ending number of the range.
     * @return The sum of the numbers in the range.
     */
    public static int sumRange(int start, int end) {
        int sum = 0;

        if (start > end) {
            System.out.println("Error: Invalid range.");
        } else {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        }

        return sum;
    }
}
