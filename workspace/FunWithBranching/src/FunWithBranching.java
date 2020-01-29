import java.util.Random;
import java.util.Scanner;

/**
 * a simple program that displays a greeting to the screen
 *
 * @author Hayden Cummins
 * @version 20190826
 */

public class FunWithBranching {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1 = 0;
        int test = 0;
        int num2 = 0;

        int num3 = 0;

        int num4 = 0;

        int num5 = 0;

        int count = 0;

        System.out.print("Enter a random number seed: ");
        int seed = keyboard.nextInt();

        Random rnd = new Random(seed);
        int x = rnd.nextInt(20) + 1; // x will be an integer between 0 and 9
        int y = rnd.nextInt(20) + 1; // y will be an integer between 1 and 10

        System.out.print("Enter your name: ");
        String name = keyboard.next();

        System.out.println("Hello " + name + "!");
        System.out.println("Please answer the following questions:");

        System.out.println("");

        num1 = x + y;
        System.out.print(x + " + " + y + " = ");
        test = keyboard.nextInt();
        if (test == num1) {
            count = count + 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is: " + num1);
        }

        System.out.println("");

        num2 = x - y;
        System.out.print(x + " - " + y + " = ");
        test = keyboard.nextInt();
        if (test == num2) {
            count = count + 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is: " + num2);
        }

        System.out.println("");

        num3 = x * y;
        System.out.print(x + " * " + y + " = ");
        test = keyboard.nextInt();
        if (test == num3) {
            count = count + 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is: " + num3);
        }

        System.out.println("");

        num4 = x / y;
        System.out.print(x + " / " + y + " = ");
        test = keyboard.nextInt();
        if (test == num4) {
            count = count + 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is: " + num4);
        }

        System.out.println("");

        num5 = x % y;
        System.out.print(x + " % " + y + " = ");
        test = keyboard.nextInt();
        if (test == num5) {
            count = count + 1;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            System.out.println("The correct answer is: " + num5);
        }

        System.out.println("");
        System.out.println("You got " + count + " correct answers!");

        int numerator = count;
        double denominator = 5.0;
        double quotient = numerator / denominator;
        System.out.println("That's " + quotient * 100 + "%!");
        //System.out.println(quotient);

        keyboard.close();
    }

}
