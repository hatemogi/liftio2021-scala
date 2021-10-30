package hopefullypure;

import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class HigherOrderFunction {
    static Function<Integer, Integer> multiple(int n) {
        return x -> x * n;
    }

    static Function<Integer, Integer> exp(int r) {
        return x -> (int)Math.pow(x, r);
    }

    static Function<Integer, Integer> triple = multiple(3);
    static Function<Integer, Integer> square = exp(2);

    public static void main(String[] args) {
        System.out.println(
          Stream.of(1, 2, 3, 4)
                .map(triple.compose(square))
                .collect(toList())
        );  // => [3, 12, 27, 48]
        // == Stream.of(1, 2, 3, 4).map(square).map(triple)...
    }
}