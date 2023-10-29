/*
 * TITLE: Homework Set 17 - Chart
 * NAME: James Tung
 * DATE: 10/25/2023
 * DESCRIPTION:
 */

public class Chart {
    public static void main(String[] args) {
        // Console setup
        System.out.println("Number | Square | Cube");
        System.out.println("-------|--------|-------");

        // Print numbers, squares, and cubes
        for (int i = 5; i <= 40; i++) {
            System.out.printf("%-7d| %-7d| %d\n", i, i*i, i*i*i);
        }
    }
}
