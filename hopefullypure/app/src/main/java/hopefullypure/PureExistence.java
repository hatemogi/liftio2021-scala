package hopefullypure;

import java.util.Optional;

public class PureExistence {
    static Optional<Integer> divide(int x, int y) {
        if (y == 0) return Optional.empty();
        else return Optional.of(x / y);
    }

    static Optional<Integer> parseInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    static Optional<Integer> stringDivide(String sx, String sy) {
        return parseInt(sx).flatMap(x ->
                 parseInt(sy).flatMap(y ->
                   divide(x, y)));
    }
}
