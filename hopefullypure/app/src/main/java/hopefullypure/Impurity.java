package hopefullypure;

import static java.lang.System.out;
import static java.lang.String.format;

public class Impurity {
    static int current = 0;
    static int impure(int n) {
        return current += n;
    }

    public static void main(String[] args) {
        int i = impure(2);
        out.println(
          format("%d, %d, %d",
                 i + i,
                 impure(2) + i,
                 impure(2) + impure(2)));
    }
}