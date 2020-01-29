import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class CoinChange1 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private CoinChange1() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        int cents;
        double filler;
        int dollars;
        int halfdollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;

        out.println(
                "How many cents would you like to make change from?(not in dollars)");
        cents = in.nextInteger();

        dollars = cents / 100;
        cents = cents % 100;

        out.println(dollars + " dollars");
        out.println(cents + " cents left");

        halfdollars = cents / 50;
        cents = cents % 50;

        out.println(halfdollars + " half dollars");
        out.println(cents + " cents left");

        quarters = cents / 25;
        cents = cents % 25;

        out.println(quarters + " quarters");
        out.println(cents + " cents left");

        dimes = cents / 10;
        cents = cents % 10;

        out.println(dimes + " dimes");
        out.println(cents + " cents left");

        nickels = cents / 5;
        cents = cents % 5;

        out.println(nickels + " nickels");
        out.println(cents + " cents left");

        pennies = cents / 1;
        cents = cents % 1;

        out.println(pennies + " pennies");
        out.println(cents + " cents left");

        in.close();
        out.close();
    }

}
