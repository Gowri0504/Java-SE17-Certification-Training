import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

public class prob1 {

    public static final Logger log = Logger.getLogger(prob1.class.getName());

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);

        log.info("Original List: " + list);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        list = new ArrayList<>(set);

        log.info("List after removing duplicates: " + list);
    }
}