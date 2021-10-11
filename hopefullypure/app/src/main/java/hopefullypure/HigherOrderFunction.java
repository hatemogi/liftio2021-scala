package hopefullypure;

import java.util.function.Function;

public class HigherOrderFunction {
    Function<Integer, Integer> multiple(int n) {
        return x -> x * n;
    }

    Function<Integer, Integer> square = x -> x * x;

    Function<Integer, Integer> triple = multiple(3);

}
