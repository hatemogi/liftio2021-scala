package hopefullypure;

import java.util.Optional;

public class NoValueThing {
    static int divideA(int x, int y) {
        return x / y;
    }

    static int divideB(int x, int y) {
        assert y != 0;
        return x / y;
    }

    static int divideC(int x, int y) {
        if (y == 0) return -1;
        return x / y;
    }

    static Optional<Integer> divide(int x, int y) {
        if (y == 0) return Optional.empty();
        else return Optional.of(x / y);
    }
}
