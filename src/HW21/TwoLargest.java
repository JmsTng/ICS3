/*
 * TITLE: Homework Set 21 - Two Largest
 * NAME: James Tung
 * DATE: 11/7/2023
 * DESCRIPTION: Write a program that finds the two largest numbers in an array of random numbers.
 */

package HW21;

public class TwoLargest {
    public static void main(String[] args) {
        // Initialize variables
        int[] numbers = new int[10];
        int largest = 0, secondLargest = 0;

        // Populate array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        // Find largest and second largest
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        // Output results
        System.out.println("The largest number is " + largest + ".");
        System.out.println("The second largest number is " + secondLargest + ".");
    }
}
