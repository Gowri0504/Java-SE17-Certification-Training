
import java.util.*;
public class Set {
    public static void main(String[] args) {
        public final Logger log=Logger .getLogger(Set.class.getName());
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); 
        System.out.println(set); 
        log.info(set.toString());
    }
    
}
