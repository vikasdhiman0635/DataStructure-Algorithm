
import java.util.Arrays;

public class W136 {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1};

        System.out.println(Arrays.stream(nums).reduce(0, (a, b) -> a ^ b));

        // .entrySet()
        // .stream()
        // .map(s -> s.getValue().equals(1))
        // .forEach(System.out::println);
    }

}
