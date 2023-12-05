/*
 * TITLE: Homework Set 31 - SoundAlarm
 * NAME: James Tung
 * DATE: 11/24/2023
 * DESCRIPTION: Prints "Alarm!" a specified number of times.
 */

package HW31;

public class SoundAlarm {
    public static void main(String[] args) {
        alarm(5);
    }

    /**
     * void alarm(int lines)
     * Prints "Alarm!" a specified number of times.
     * @param lines The number of times to print "Alarm!".
     */
    public static void alarm(int lines) {
        if (lines < 0) {
            System.out.println("Error: Invalid number of lines.");
        } else {
            for (int i = 0; i < lines; i++) {
                System.out.println("Alarm!");
            }
        }
    }
}
