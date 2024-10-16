package Stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Questions {
    
    public static void main(String[] args) {
        
        // How to find duplicate elements in a Stream in Java?
        Stream<Integer> stream = Stream.of(2, 17, 5, 20, 17, 30, 4, 23, 59, 23); 
        System.out.println(findDuplicateInStream(stream));
    }

    private static Set findDuplicateInStream(Stream<Integer> stream) {

        Set<Integer> unique = new HashSet<Integer>();
        return stream.filter(n -> !unique.add(n)).collect(Collectors.toSet());

    }

}
