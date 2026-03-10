import java.util.*;


public class p1 {
    //given list if integres 5,9,1,7,3,8,2 find top 3 largest num using streams

        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(5,9,1,7,3,8,2);
    
            list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
        }
}
