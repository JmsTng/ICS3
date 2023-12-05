/*
 * TITLE: Homework Set 35 - Print All Characters
 * NAME: James Tung
 * DATE: 12/4/2023
 * DESCRIPTION: This program reads a file and prints each character to the console as long as they are not new lines, carriage returns, or spaces.
 */

package HW35;

import java.io.*;

public class PrintAllChar {
    public static void main(String[] args) {
        // Initialize variables
        String path = "src/HW35/in/allChar.txt";
        int ch;

        try {
            // Create BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(path));

            // Read each line and print
            ch = br.read();
            while (ch != -1) {
                if ((char) ch != '\n' && (char) ch != '\r' && (char) ch != ' ') { // Skip newlines and spaces
                    System.out.println((char) ch);
                }

                ch = br.read();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
