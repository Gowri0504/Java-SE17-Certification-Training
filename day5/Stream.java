
import java.util.*;

public class Stream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java","python","c++","spring");

        // change to uppercase using map
        list.stream()
            .map(s -> s.toUpperCase())
            .forEach(System.out::println);
    }
}