import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Oddity2 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Oddity2() {
    }

    /**
     * Put a short phrase describing the static method myMethod here.
     */
    private static void myMethod() {
        /*
         * Put your code for myMethod here
         */
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        double x = 456.0;
        double y = 100.00 * 4.56;
        if (Math.abs(x - y) < 0.01) {
            out.println("equal");
        } else {
            out.println("not equal");
        }
        out.close();
    }

}
