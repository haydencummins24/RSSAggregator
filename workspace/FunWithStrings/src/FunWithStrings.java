import java.util.Scanner;

/**
 * A simple program to read in a string and substring, then test values from
 * both
 *
 * @author Hayden Cummins
 * @version 20190912
 */

public class FunWithStrings {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a long string: ");

        String longstr = keyboard.nextLine();

        System.out.print("Enter a substring: ");

        String substringy = keyboard.nextLine();

        int longlength = longstr.length();

        System.out.println("Length of your string: " + longlength);

        int sublength = substringy.length();

        System.out.println("Length of your substring: " + sublength);

        int subloc = longstr.indexOf(substringy);

        System.out.println("Starting position of your substring: "
                + longstr.indexOf(substringy));

        System.out.println("String before your substring: "
                + longstr.substring(0, (subloc)));

        System.out.println("String after your substring: "
                + longstr.substring((subloc + sublength)));

        System.out.print(
                "Enter a position between 0 and " + (longlength - 1) + ": ");

        String myNum = keyboard.nextLine();

        int value = Integer.parseInt(myNum);

        char val = longstr.charAt(value);

        System.out.println("The character at position " + value + " is " + val);

        System.out.print("Enter a replacement string: ");

        String replacem = keyboard.nextLine();

        longstr = longstr.replace(substringy, replacem);

        System.out.println("Your new string is: " + longstr);

        System.out.println("Goodbye!");

        keyboard.close();

    }
}