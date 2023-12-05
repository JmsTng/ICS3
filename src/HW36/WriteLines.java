/*
 * TITLE: Homework Set 36 - Write Lines
 * NAME: James Tung
 * DATE: 12/4/2023
 * DESCRIPTION:
 */

package HW36;

import java.io.*;

public class WriteLines {
    public static void main(String[] args) {
        // Initialize variables
        String path = "out/writeLines.txt";

        // Create file
        try {
            File file = new File(path);
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
