/*
 * TITLE: Homework Set XX - Group Totaler
 * NAME: James Tung
 * DATE: 12/10/2023
 * DESCRIPTION:
 */

package HW37;

import java.io.*;

public class GroupTotaler {
    public static void main(String[] args) {
        // Initialize variables
        String path = "src/HW37/in/input.txt";
        String line;
        int sum = 0;

        // Collect input
        try {
            // Create BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(path));

            // Read each line and add to sum if it is a number
            // Else, print sum and reset
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if (line.matches("\\d+")) {
                    sum += Integer.parseInt(line);
                } else {
                    System.out.println("Sum = " + sum);
                    sum = 0;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
