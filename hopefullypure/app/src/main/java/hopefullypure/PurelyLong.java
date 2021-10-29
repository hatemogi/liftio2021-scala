package hopefullypure;

import static java.lang.System.out;
import static java.lang.String.format;

public class PurelyLong {
    static int pure(int a, int b) {
        return 2 * a * a + 3 * b;
    }

    static int expressionA(int a, int b) {
        return 4 * a * a + pure(a, b) + 6 * b;
    }

    static int expressionB(int a, int b) {
        return 3 * pure(a, b);
    }

    public static void main(String[] args) {
        out.println(
          format("%d, %d",
            expressionA(3, 4),
            expressionB(3, 4)));
    }
}

