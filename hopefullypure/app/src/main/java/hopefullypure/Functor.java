package hopefullypure;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class Functor extends HigherOrderFunction {
    Function<Integer, Boolean> odd = x -> x % 2 == 0;
    Function<Integer, Boolean> tripleOdd = odd.compose(triple);

    List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);

    <A, B> List<B> fmap(List<A> xs, Function<A, B> f) {
        return xs.stream().map(f).collect(toList());
    }

    <A, B> Optional<B> fmap(Optional<A> oa, Function<A, B> f) {
        return oa.map(f);
    }

    public void run() {
        out.println(triple.apply(3));
        out.println(fmap(ints, triple));
        out.println(fmap(ints, odd));
    }
}
