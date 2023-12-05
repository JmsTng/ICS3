/*
 * TITLE: Homework Set 31 - CheckDivisibilty
 * NAME: James Tung
 * DATE: 11/24/2023
 * DESCRIPTION: Returns whether the number is evenly divisible by the divisor.
 */

package HW31;

public class CheckDivisibilty {
    public static void main(String[] args) {
        System.out.println(evenlyDivisible(10, 5));
    }

    /**
     * boolean evenlyDivisible(int num, int divisor)
     * Returns whether the number is evenly divisible by the divisor.
     * @param num1 The number to check.
     * @param num2 The divisor to check.
     * @return Whether the number is evenly divisible by the divisor.
     */
    public static boolean evenlyDivisible(int num1, int num2) {
        boolean isDiv = (num1 % num2 == 0) || (num2 % num1 == 0);
        return isDiv;
    }
}
