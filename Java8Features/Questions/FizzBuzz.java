import java.util.function.Consumer;
import java.util.function.IntPredicate;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println();

        Consumer<Object> cons = c -> System.out.println(c);

        IntPredicate pr1 = i -> i % 3 == 0;
        IntPredicate pr2 = i -> i % 5 == 0;

        for (int i = 1; i <= 100; i++) {
            if (pr1.and(pr2).test(i)) {
                cons.accept("FizzBuzz");
            } else if (pr1.test(i)) {
                cons.accept("Fizz");
            } else if (pr2.test(i)) {
                cons.accept("Buzz");
            } else {
                cons.accept(i);
            }
        }

    }

}
