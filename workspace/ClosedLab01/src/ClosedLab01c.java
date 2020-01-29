import java.util.Scanner;

/**
 *
 * I expect the program to prompt for a name and a number and to push a short
 * greeting followed by a list of the number, the same number squared and cubed.
 *
 * @author Hayden Cummins
 * @version 20190826
 *
 */
public class ClosedLab01c {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myName = keyboard.nextLine();
        System.out.print("Enter a whole number: ");
        String myNumber = keyboard.nextLine();
        int value = Integer.parseInt(myNumber);
        System.out.println("Hello " + myName);
        System.out.println("Your number is: " + value);
        System.out.println("Your number squared is: " + (value * value));
        int cubed = value * value * value;
        System.out.println("Your number cubed is: " + cubed);
        keyboard.close();
    }

}
