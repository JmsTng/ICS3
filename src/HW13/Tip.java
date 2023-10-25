/*
 * TITLE: Homework Set 13 - Study Tip
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Output a study tip based on the user's grade.
 */

import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        // Initialization
        Scanner sc = new Scanner(System.in);
        char grade = sc.nextLine().strip().charAt(0);

        // Logic and output
        switch (grade) {
            case 'A' -> System.out.println("Great job! Make sure to periodically review your notes and programs to keep up your grades.");
            case 'B' -> System.out.println("Good work! Look over your learning resources to see where you can go above and beyond.");
            case 'C' -> System.out.println("You can do better! Ask questions and review your notes to improve your grade.");
            case 'D' -> System.out.println("You need to work harder! Schedule some time with your teacher to get some extra help.");
            case 'F' -> System.out.println("You're failing! You need all the help you can get, so schedule extra help time and do research outside of class time to see where you can improve.");
            default -> System.out.println("Invalid grade");
        }
    }
}
