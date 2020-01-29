import java.util.Scanner;

/**
 *
 * A program to prompt the user for a starting number and generate a hailstone
 * series.
 *
 * @author Hayden Cummins
 * @version 20190916
 *
 */
public class HailstoneSeries {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a starting value: ");
        int n = keyboard.nextInt();

        System.out.print(n + ", ");

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 == 1) {
                n = (n * 3) + 1;
            }
            if (n > 1) {
                System.out.print(n + ", ");
            } else {
                System.out.print(n);
            }
        }

        keyboard.close();
    }
}
