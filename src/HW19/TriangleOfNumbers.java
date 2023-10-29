/*
 * TITLE: Homework Set XX - TriangleOfNumbers
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION:
 */

public class TriangleOfNumbers {
    public static void main(String[] args) {
        // Print triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
