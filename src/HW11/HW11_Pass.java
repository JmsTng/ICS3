/*
 * TITLE: Homework Set 11 - Pass
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION: Prompt the user with a math problem. Output whether the user got it right or wrong.
 */

public class HW11_Pass {
    public static void main (String[] args) {
        // Generate random numbers
        int terms = (int) (Math.random() * 9) + 2; // Number of terms
        System.out.println(buildEquation(0, terms, new Object[32], 0));
    }

    public static Object buildEquation (int iteration, int iterationLimit, Object[] expr, double value) {
        double valueCopy = value;
        if (iteration == 0) {
            int random = (int) (Math.random() * 1000);
            expr[expr.length - 1] = random;
            valueCopy = random;
        } else {
            // Generate random BEDMAS operator
            int operator = (int) (Math.random() * 6);

        }

        if (iteration == iterationLimit) {
            return expr;
        } else {
            return buildEquation(iteration + 1, iterationLimit, expr, valueCopy);
        }
    }
}
