/*
 * TITLE: Homework Set 36 - Write Lines
 * NAME: James Tung
 * DATE: 12/4/2023
 * DESCRIPTION:
 */

package HW36;

import java.io.*;
import java.util.Scanner;

public class WriteLines {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String path = "out/writeLines.txt";
        final int NUM_LINES = 10;
        String[] lines = new String[NUM_LINES];

        // Collect input
        for (int i = 0; i < NUM_LINES; i++) {
            lines[i] = sc.nextLine();
        }

        // Create file
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(path));
            file.write(String.join("\n", lines));
            file.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
