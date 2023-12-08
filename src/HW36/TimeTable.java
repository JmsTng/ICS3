/*
 * TITLE: Homework Set 36 - Times Table
 * NAME: James Tung
 * DATE: 12/7/2023
 * DESCRIPTION: This program creates a 12 by 12 multiplication table and outputs it to a file.
 */

package HW36;

import java.io.*;

public class TimeTable {
    public static void main(String[] args) {
        // Initialize variables
        String path = "out/timetable.txt";
        int padding = 5;

        // Create/write table
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(path, false)); // Create file

            // Write table to file
            file.write(" ".repeat(padding));
            for (int i = 1; i <= 12; i++) {
                file.write(String.format("%-" + padding + "d", i));
            }
            for (int i = 1; i <= 12; i++) {
                file.write(String.format("%n%-" + padding + "d", i));
                for (int j = 1; j <= 12; j++) {
                    file.write(String.format("%-" + padding + "d", i * j));
                }
            }

            file.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
