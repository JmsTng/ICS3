/*
 * TITLE: Homework Set 35 - Print Lines
 * NAME: James Tung
 * DATE: 2023-12-01
 * DESCRIPTION: This program reads a file and prints each line to the console.
 */

package HW35;

import java.io.*;

public class PrintLines {
    public static void main(String[] args) {
        // Initialize variables
        String path = "src/HW35/in/line.txt";
        String line;

        try {
            // Create BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(path));

            // Read each line and print
            line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
