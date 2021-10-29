package hopefullypure;

import static java.lang.System.out;
import static java.lang.String.format;

public class Purity {
    static int pure(int a, int b) {
        return 2*a*a + 3*b;
    }

    public static void main(String[] args) {
        int p = pure(2, 3);
        out.println(
          format("%d, %d, %d",
                 p + p,
                 pure(2, 3) + p,
                 pure(2, 3) + pure(2, 3))); // => 34, 34, 34
    }

    int pureLongExpressionA(int a, int b) {
        return 4*a*a + pure(a, b) + 6*b;
    }

    int pureLongExpressionB(int a, int b) {
        return 3 * pure(a, b);
    }
}
