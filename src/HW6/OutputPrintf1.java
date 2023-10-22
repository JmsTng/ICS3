/*
 * TITLE: Homework Set 6 - Account Balances 1
 * NAME: James Tung
 * DATE: 9/19/2023
 * DESCRIPTION: Output the account balances of Juanita and Juan padded using string flags.
 */

public class OutputPrintf1 {
    public static void main (String[] args) {
        double juanitaBank = 2345678.99;
        double juanBank = 15455.26;

        String juanita = "Juanita's account balance is $%,.2f.\n".formatted(juanitaBank);
        String juan = "Juan's account balance is $%,12.2f.\n".formatted(juanBank);
        int targetLength = juanita.length();

        System.out.printf(juanita);
        System.out.printf("%" + targetLength + "s", juan);
    }
}
