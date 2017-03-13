/**
 * Print quotients and remainders of independent divisions.
 */
public class SeveralDivisionsAndMethods {
    public static void main(String[] args) {

        prnt(remainder(5, 2));

        int rem = remainder(9,5);
        prnt(rem);
    }

    // Print a line containing value.
    private static void prnt(int value) {
        System.out.println(value);    // side effect, no result
    }

    // Print the quotient of dividend / divisor
    // and return the remainder of dividend / divisor.
    private static int remainder(int dividend, int divisor) {
        prnt(dividend / divisor);     // side effect
        return(dividend % divisor);   // specify result
    }
}
