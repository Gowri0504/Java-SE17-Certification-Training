import java.util.*;
import java.util.stream.Collectors;

public class p2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java","python","go");

        Map<String,Integer> map =
                list.stream()
                    .collect(Collectors.toMap(
                            name -> name,
                            name -> name.length()
                    ));

        System.out.println(map);
    }
}