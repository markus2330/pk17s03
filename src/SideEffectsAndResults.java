/**
 * What do I do?
 * Where are my side effects?
 * Where do I return results?
 */
public class SideEffectsAndResults {
    public static void main(String[] args) {

        int m = 1027;   // initial values changeable
        int n = 395;    // m > 0 und n > 0

        while (m != n) {
            m = minimize(m, n);
            n = minimize(n, m);
        }
        System.out.println(m);
    }

    private static int minimize(int x, int y) {
        return ((y < x) ? (x - y) : x);
    }
}
