import java.util.Random;
import java.util.Scanner;

/**
 *
 * A program to prompt the user for a random number seed and then generate a
 * random number which will be used in a guessing game
 *
 * @author Hayden Cummins
 * @version 20190909
 *
 */
public class RandomNumber1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a random seed: ");
        int seed = keyboard.nextInt();
        Random rnd = new Random(seed);
        int computerNum = rnd.nextInt(10) + 1; // computerNum will be between 1 and 10

        int guess = 0;

        System.out.println("I'm thinking of a number between 1 and 10");
        System.out.print("What is your guess?: ");

        guess = keyboard.nextInt();

        System.out.println("My number was: " + computerNum);

        if (computerNum >= guess) {
            System.out.println("Your number was not larger!");
        } else if (guess > computerNum) {
            System.out.println("Your number was larger!");
        }

        keyboard.close();
    }
}
