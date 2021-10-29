package hopefullypure;

import static java.lang.System.out;
import static java.lang.String.format;

public class Purity {
    static int pure(int a, int b) {
        return 2*a*a + 3*b;
    }

    static int current = 0;
    static int impure(int n) {
        return current += n;
    }

    public static void main(String[] args) {
        int p = pure(2, 3);
        out.println(
          format("%d, %d, %d",
                  p + p,
                  pure(2, 3) + p,
                  pure(2, 3) + pure(2, 3))); // => 34, 34, 34

        int i = impure(2);

        out.println(
          format("%d, %d, %d",
            i + i,
            impure(2) + i,
            impure(2) + impure(2)));  // => 4, 6, 14
    }
}
