/*
 * TITLE: Homework Set 33 - Line
 * NAME: James Tung
 * DATE: 11/24/2023
 * DESCRIPTION: Returns the length and slope of a line.
 */

package HW33;

public class Line {
    /**
     * double length(int x1, int y1, int x2, int y2)
     * Returns the length of the line as a double.
     * @param x1 The x-coordinate of the first point.
     * @param y1 The y-coordinate of the first point.
     * @param x2 The x-coordinate of the second point.
     * @param y2 The y-coordinate of the second point.
     * @return The length of the line.
     */
    public static double length(int x1, int y1, int x2, int y2) {
        double len = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Distance formula
        return len;
    }

    /**
     * double slope(int x1, int y1, int x2, int y2)
     * Returns the slope of the line as a double.
     * @param x1 The x-coordinate of the first point.
     * @param y1 The y-coordinate of the first point.
     * @param x2 The x-coordinate of the second point.
     * @param y2 The y-coordinate of the second point.
     * @return The slope of the line.
     */
    public static double slope(int x1, int y1, int x2, int y2) {
        double slope = (y2 - y1 + 0.0) / (x2 - x1); // Slope formula
        return slope;
    }
}
