/*
 * TITLE: Homework Set 20 - Height
 * AUTHOR: James Tung
 * DATE: 11/2/2023
 * DESCRIPTION: Ask for the height of 20 people and output all who are above the average height of the dataset.
 */

package HW20;

import java.util.Arrays;
import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_HEIGHTS = 20;
        int[] heights = new int[NUM_HEIGHTS];

        for (int i = 0; i < NUM_HEIGHTS; i++) {
            System.out.print("Enter height " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }

        double avg = Arrays.stream(heights).average().getAsDouble();

        for (int i: heights) {
            if (i > avg) {
                System.out.println(i);
            }
        }
    }
}
