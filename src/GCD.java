/**
 * Compute and print greatest common divisors.
 */
public class GCD {

    // Compute greatest common divisor from m and n.
    private static int greatestCommonDivisor(int m, int n) {

        while (m != n) {
            if (m > n) {
                m = m - n;
            }
            else {
                n = n - m;
            }
        }

        return m;
    }


    public static void main(String[] args) {
        int m = 1027;      // initial values of m and n changeable
        int n = 395;
        System.out.println(greatestCommonDivisor(m, n));
        System.out.println(greatestCommonDivisor(12,4));

        System.out.println(greatestCommonDivisor(20,greatestCommonDivisor(5,10)));
    }
}
