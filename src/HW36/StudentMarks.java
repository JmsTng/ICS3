/*
 * TITLE: Homework Set 36 - StudentMarks
 * NAME: James Tung
 * DATE: 12/7/2023
 * DESCRIPTION: This program reads a file containing student marks and outputs the average for each student, the highest average, and the average for each test.
 */

package HW36;

import java.io.*;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        // Initialize variables
        final int STUDENTS;
        final int EXAMS;
        float[][] marks;
        float[] averages;
        String in = "src/HW36/in/marks.txt";
        String out = "out/result.txt";

        try {
            // Get number of students and exams
            Scanner sc = new Scanner(new File(in));
            STUDENTS = sc.nextInt();
            EXAMS = sc.nextInt();

            marks = new float[STUDENTS][EXAMS];

            // Read marks from file
            for (int i = 0; i < STUDENTS; i++) {
                for (int j = 0; j < EXAMS; j++) {
                    marks[i][j] = sc.nextFloat();
                }
            }

            BufferedWriter file = new BufferedWriter(new FileWriter(out));

            // Calculate averages
            averages = new float[STUDENTS];
            for (int i = 0; i < STUDENTS; i++) {
                float sum = 0;
                for (int j = 0; j < EXAMS; j++) {
                    sum += marks[i][j];
                }
                averages[i] = sum / EXAMS;
                file.write(String.format("Student %d: %.2f%n", i + 1, averages[i]));
            }

            // Find highest average
            float highest = averages[0];
            for (int i = 1; i < STUDENTS; i++) {
                if (averages[i] > highest) {
                    highest = averages[i];
                }
            }
            file.write(String.format("--%nHighest average: %.2f%n--%n", highest));

            // Calculate test averages
            float[] testAverages = new float[EXAMS];
            for (int i = 0; i < EXAMS; i++) {
                float sum = 0;
                for (int j = 0; j < STUDENTS; j++) {
                    sum += marks[j][i];
                }
                testAverages[i] = sum / STUDENTS;
                file.write(String.format("Test %d average: %.2f%n", i + 1, testAverages[i]));
            }

            // Close file
            file.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
