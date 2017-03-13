/**
 * Which number do I print?
 */
public class ParameterNames {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        xyMinus(y, x);
        xyMinus(x, y);
    }

    private static void xyMinus(int x, int y) {
        System.out.println(x - y);
    }
}
