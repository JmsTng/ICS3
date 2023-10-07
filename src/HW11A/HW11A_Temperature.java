/*
 * TITLE: Homework Set 11A - Temperature
 * NAME: James Tung
 * DATE: 10/7/2023
 * DESCRIPTION: Take an input of degrees Celsius and output a message depending on which range the temperature is in.
 */

package HW11A;

import java.util.Scanner;

public class HW11A_Temperature {
    public static void main(String[] args) {
        // Prompt user for temperature
        System.out.print("Enter a temperature in degrees Celsius: ");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        // Output message depending on temperature
        if (temp < -18) {
            System.out.println("Very cold.");
        } else if (temp < 0) {
            System.out.println("Cold.");
        } else if (temp == 0) {
            System.out.println("Freezing point of water.");
        } else if (temp < 10) {
            System.out.println("Very cool.");
        } else if (temp < 20) {
            System.out.println("Moderate.");
        } else if (temp < 30) {
            System.out.println("Warm.");
        } else if (temp < 40) {
            System.out.println("Hot.");
        } else if (temp < 100) {
            System.out.println("Extremely hot.");
        } else {
            System.out.println("Boiling point of water.");
        }
    }
}
