/*
 * TITLE: Homework Set 37 - Group Totaler
 * NAME: James Tung
 * DATE: 12/10/2023
 * DESCRIPTION: Add together numbers separated into groups.
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
            if ((line = br.readLine()) != null) { // Check if file is empty
                System.out.println(line);
            }
            while ((line = br.readLine()) != null) {
                try {
                    sum += Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.println("Sum = " + sum + "\n");
                    sum = 0;
                    System.out.println(line);
                }
            }
            System.out.println("Sum = " + sum);
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
