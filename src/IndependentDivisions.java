/**
 * Print quotients and remainders of independent divisions.
 */
public class IndependentDivisions {
    public static void main(String[] args) {
        divide(5, 2);
        divide(9, 5);
        divide(1234, 35);
        divide(19, 17);
    }

    // Print quotient and remainder of dividend / divisor.
    private static void divide(int dividend, int divisor) {
        System.out.println(dividend / divisor);
        System.out.println(dividend % divisor);
    }
}
