/**
 * Compute and print greatest common divisors.
 */
public class GCD {
    public static void main(String[] args) {

        int m = 1027;      // initial values of m and n changeable
        int n = 395;

        while (m != n) {
            if (m > n) {
                m = m - n;
            }
            else {
                n = n - m;
            }
        }

        System.out.println(m);
    }
}
