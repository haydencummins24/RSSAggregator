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
public final class Newton2 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Newton2() {
    }

    /**
     * Put a short phrase describing the static method myMethod here.
     */
    private static double sqrt(double x) {

        double r = x;

        double e = 0.0001;

        if (x == 0) {
            return 1;
        } else {
            while (Math.abs(r - x / r) > e * r) {

                r = (x / r + r) / 2.0;

            }
        }
        return r;

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

        double x = 0;
        double y = 0;
        String yon = "y";

        while (!yon.contentEquals("n")) {
            out.println("Enter a positive double: ");
            x = in.nextDouble();

            y = sqrt(x);
            out.println("The Square Root of " + x + " is: " + y);

            out.println("Do you wish to calculate another square root? (y/n)");
            yon = in.nextLine();

        }

        in.close();
        out.close();
    }

}
