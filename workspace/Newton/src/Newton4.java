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
public final class Newton4 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Newton4() {
    }

    /**
     * Put a short phrase describing the static method myMethod here.
     */
    private static double sqrt(double x, double e) {

        double r = x;

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

        double x = 1;
        double y = 0;
        double e = 0;

        while (x > 0) {
            out.println("Enter a positive double: ");
            x = in.nextDouble();

            if (x > 0) {

                out.println("Enter the margin for error: ");
                e = in.nextDouble();

                y = sqrt(x, e);
                out.println("The Square Root of " + x + " is: " + y);
            }
        }

        in.close();
        out.close();
    }

}
