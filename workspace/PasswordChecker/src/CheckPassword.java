import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * A program to check the rigidity of a password
 *
 * @author Hayden Cummins
 *
 */
public final class CheckPassword {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private CheckPassword() {
    }

    /**
     * Checks if the given String contains an upper case letter.
     *
     * @param s
     *            the String to check
     * @return true if s contains an upper case letter, false otherwise
     */
    private static boolean containsUpperCaseLetter(String s) {
        boolean checkr = false;
        for (int i = 0; i < s.length(); i++) {
            char upp = s.charAt(i);
            if (Character.isUpperCase(upp)) {
                i = i + s.length();
                checkr = true;
            }
        }
        return checkr;

    }

    /**
     * Checks if the given String contains an lower case letter.
     *
     * @param s
     *            the String to check
     * @return true if s contains an lower case letter, false otherwise
     */
    private static boolean containsLowerCaseLetter(String s) {
        boolean checkr = false;
        for (int i = 0; i < s.length(); i++) {
            char low = s.charAt(i);
            if (Character.isLowerCase(low)) {
                i = i + s.length();
                checkr = true;
            }
        }
        return checkr;
    }

    /**
     * Checks if the given String contains an lower case letter.
     *
     * @param s
     *            the String to check
     * @return true if s contains an lower case letter, false otherwise
     */
    private static boolean containsDigit(String s) {
        boolean checkr = false;
        for (int i = 0; i < s.length(); i++) {
            char dig = s.charAt(i);
            if (Character.isDigit(dig)) {
                i = i + s.length();
                checkr = true;
            }
        }
        return checkr;
    }

    /**
     * Checks whether the given String satisfies the OSU criteria for a valid
     * password. Prints an appropriate message to the given output stream.
     *
     * @param s
     *            the String to check
     * @param out
     *            the output stream
     */
    private static void checkPassword(String s, SimpleWriter out) {
        int c = 0;
        int len = 0;
        if (s.length() >= 8) {
            len = 1;
        }

        c += containsUpperCaseLetter(s) ? 1 : 0;

        c += containsDigit(s) ? 1 : 0;

        c += containsLowerCaseLetter(s) ? 1 : 0;

        if (c >= 2) {
            out.println("Password meets 2 or more requirements.");
        } else {
            out.println(
                    "Password does not meet requirements. Password Denied.");
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

        String s;

        out.println("Please enter a password candidate");
        s = in.nextLine();

        checkPassword(s, out);
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
