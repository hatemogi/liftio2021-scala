package hopefullypure;

import static java.util.stream.IntStream.rangeClosed;

public class HigherLevel {
    static int factA(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) r *= i;
        return r;
    }

    static int factB(int n) {
        if (n <= 1) return 1;
        return n * factB(n - 1);
    }

    static int factC(int n) {
        return rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        System.out.println(
          String.format("%d, %d, %d",
            factA(5), factB(5), factC(5)));
    }
}
