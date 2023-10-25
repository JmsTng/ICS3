/*
 * TITLE: Homework Set 6 - Square Table 2
 * NAME: James Tung
 * DATE: 9/19/2023
 * DESCRIPTION: Output a table of numbers and their squares using string flags.
 */

public class OutputPrintf2 {
    public static void main (String[] args) {
        int width = 15; // width of the table
        double num;
        System.out.printf("Number%"+(width-6)+"s\n", "Square");
        for (int i = 0; i <= 5; i++) {
            num = 1.1 + i * 0.01; // precalculate the number
            System.out.printf("%.2f%"+(width-4)+".5f\n", num, num * num); // print the number and its square to 2 and 5 decimal places respectively
        }
    }
}
