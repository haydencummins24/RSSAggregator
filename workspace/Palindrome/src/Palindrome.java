import java.util.Scanner;

/**
 *
 * @author Hayden Cummins
 *
 * @version 20190923
 *
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String palend = keyboard.nextLine();

        String dnelap = "";

        while (palend.length() > 0) {

            for (int i = palend.length() - 1; i >= 0; i--) {
                dnelap = dnelap + palend.charAt(i);
            }

            if (palend.equalsIgnoreCase(dnelap)) {
                System.out.println(palend + " is a palendrome");
            } else {
                System.out.println(palend + " is NOT a palindrome.");
            }

            System.out.println("");

            System.out.print("Enter a string: ");
            palend = keyboard.nextLine();
            dnelap = "";

        }
        System.out.println("Empty line read - Goodbye!");

        keyboard.close();
    }

}