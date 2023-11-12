/*
 * TITLE: Homework Set 25A - Tennis
 * NAME: James Tung
 * DATE: 11/12/2023
 * DESCRIPTION:
 */

package HW25A;

import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 5;
        final int PLAYERS = 2;
        int[][] scores = new int[PLAYERS][SIZE];
        int p2Rounds = 0;
        int p1Sets = 0;
        String[] values;

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Set %d:  ", i + 1);
            values = sc.nextLine().split("-");
            scores[0][i] = Integer.parseInt(values[0]); // Player 1
            scores[1][i] = Integer.parseInt(values[1]); // Player 2
        }

        // Aggregate scores
        for (int i = 0; i < SIZE; i++) {
            p2Rounds += scores[1][i];
            if (scores[0][i] > scores[1][i]) {
                p1Sets++;
            }
        }

        // Output results
        System.out.printf("Player 2 won %d rounds.%n", p2Rounds);
        System.out.printf("Player 1 won %d sets.", p1Sets);
    }
}
