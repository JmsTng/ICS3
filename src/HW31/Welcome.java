/*
 * TITLE: Homework Set 31 - Welcome
 * NAME: James Tung
 * DATE: 11/24/2023
 * DESCRIPTION:
 */

package HW31;

public class Welcome {
    public static void main(String[] args) {

    }

    /**
     * String welcomeMessage(String name, int visitorNum)
     * Returns a welcome message with the name and visitor number.
     * @param name The name of the visitor.
     * @param visitorNum The visitor's number.
     * @return A welcome message with the name and visitor number.
     */
    public static String welcomeMessage(String name, int visitorNum) {
        String res = "Welcome %s! You are visitor number %d.".formatted(name, visitorNum);
        return res;
    }
}
