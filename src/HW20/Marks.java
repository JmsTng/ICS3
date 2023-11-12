package HW20;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int NUM_MARKS = 4;
        String[] names = new String[NUM_MARKS];
        double[] marks = new double[NUM_MARKS];
        double mark;
        boolean found = false;

        // Read input
        for (int i = 0; i < NUM_MARKS; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Search for a mark and output the name (if found)
        System.out.print("Enter a mark: ");
        mark = sc.nextDouble();
        for (int i = 0; i < NUM_MARKS; i++) {
            if (marks[i] == mark) {
                found = true;
                System.out.println(names[i]);
            }
        }

        // Output if no mark was found
        if (!found) {
            System.out.println("No student found with that mark.");
        }
    }
}
