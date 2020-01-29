import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * A program that calculates the Hailstone Series of any input number
 *
 * @author Hayden Cummins
 *
 */
public final class Hailstone1 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Hailstone1() {
    }

    /**
     * Put a short phrase describing the static method myMethod here.
     */
    private static void generateSeries(int n, SimpleWriter out) {

        int x = n;

        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else if (x % 2 == 1) {
                x = (x * 3) + 1;
            }
            System.out.println(x);
        }
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
        /*
         * Put your main program code here; it may call myMethod as shown
         */
        System.out.println("Enter a positive integer: ");
        int num = in.nextInteger();
        generateSeries(num, out);

        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
