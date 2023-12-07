/*
 * TITLE: Homework Set 35 - Add Numbers
 * NAME: James Tung
 * DATE: 12/4/2023
 * DESCRIPTION: This program reads a file and adds each line to a sum.
 */

package HW35;

import java.io.*;

public class AddNumbers {
    public static void main(String[] args) {
        // Initialize variables
        String path = "src/HW35/in/numbers.txt";
        String line;
        int sum = 0;

        try {
            // Create BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(path));

            // Read each line and add to sum
            line = br.readLine();
            while (line != null) {
                sum += Integer.parseInt(line);
                line = br.readLine();
            }
            br.close();

            // Print sum
            System.out.println(sum);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e);
        }
    }
}
