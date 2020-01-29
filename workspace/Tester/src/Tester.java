import java.util.Scanner;

/*
 * A program for simple arithmetic
 *
 * @author Hayden Cummins
 * @version 20190905
 */
public class Tester {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int d = 0;
        int a = 0;
        int s = 0;
        int m = 0;
        int r = 0;
        int ave = 0;

        System.out.print("Enter the first number: ");
        x = in.nextInt();
        System.out.print("Enter the second number: ");
        y = in.nextInt();

        a = x + y;
        System.out.println(x + " + " + y + " = " + a);
        s = x - y;
        System.out.println(x + " - " + y + " = " + s);
        m = x * y;
        System.out.println(x + " * " + y + " = " + m);
        d = x / y;
        System.out.println(x + " / " + y + " = " + d);
        r = x % y;
        System.out.println(x + " % " + y + " = " + r);
        ave = (x + y) / 2;
        System.out.println("The average of your two numbers is: " + ave);

        in.close();
    }
}
