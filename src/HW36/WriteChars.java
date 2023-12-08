/*
 * TITLE: Homework Set 36 - Write Characters
 * NAME: James Tung
 * DATE: 12/7/2023
 * DESCRIPTION: This program reads lines from the console and writes each character to a file on a new line.
 */

package HW36;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class WriteChars {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String path = "out/writeChars.txt";
        String input;

        // Collect input
        input = sc.nextLine();
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(path, false)); // Create file
            Files.createDirectories(new File(path).getParentFile().toPath()); // Create directories if they don't exist

            // Write input to file
            while (!input.equals("stop")) {
                for (int i = 0; i < input.length(); i++) {
                    file.write(input.charAt(i) + "\n"); // Write each character on a new line
                }
                file.write("\n");
                input = sc.nextLine();
            }

            file.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
