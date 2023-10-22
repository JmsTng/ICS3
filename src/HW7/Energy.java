/*
 * TITLE: Homework Set 7 - Energy
 * NAME: James Tung
 * DATE: 9/23/2023
 * DESCRIPTION: Given the mass of an object, calculate the number of lightbulbs that can be powered.
 */

import java.util.Scanner;

public class Energy {
    public static void main (String[] args) {
        System.out.println("Enter the mass of the object in kilograms:");
        Scanner sc = new Scanner(System.in);
        double mass = sc.nextDouble();
        int light = 3 * (int) Math.pow(10, 8); // speed of light in m/s
        double energy = mass * Math.pow(light, 2); // E = mc^2

        System.out.println("The energy produced is " + energy + " joules.");
        System.out.println("The number of 100-watt lightbulbs that can be powered for an hour is " + energy / 360000 + ".");
    }
}
