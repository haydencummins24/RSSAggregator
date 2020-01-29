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
public final class CoinChange2 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private CoinChange2() {
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

        int[] coins = new int[] { 100, 50, 25, 10, 5, 1 };
        int[] coincount = new int[6];
        int cents;

        out.println(
                "How many cents would you like to make change from?(not in dollars)");
        cents = in.nextInteger();

        for (int i = 0; i < 5; i++) {
            coincount[i] = cents / coins[i];
            cents = cents % coins[i];
        }

        for (int i = 0; i < 5; i++) {
            out.println("Coin Value: " + coins[i] + " ");
            out.println("Number of Coins: " + coincount[i]);
            out.println(" ");
        }

        in.close();
        out.close();
    }

}
