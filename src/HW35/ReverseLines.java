/*
 * TITLE: Homework Set 35 - Reverse Lines
 * NAME: James Tung
 * DATE: 12/4/2023
 * DESCRIPTION: This program reads a file and prints each line to the console from the bottom of the file to the top.
 */

package HW35;

import java.io.*;
import java.util.*;

public class ReverseLines {
    public static void main(String[] args) {
        // Initialize variables
        String path = "src/HW35/in/reverse.txt";
        int lines;
        String[] lineArr;
        Scanner sc;

        try {
            sc = new Scanner(new File(path));

            // Get number of lines
            lines = sc.nextInt();
            lineArr = new String[lines];
            sc.nextLine(); // Skip to next line

            for (int i = 0; i < lines; i++) {
                // Get line and split into array
                lineArr[i] = sc.nextLine();
            }

            // Print lines in reverse
            for (int i = lines - 1; i >= 0; i--) {
                System.out.println(lineArr[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: File malformed. First line must be an integer.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
