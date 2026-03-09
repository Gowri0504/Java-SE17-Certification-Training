
import java.util.ArrayList;
import java.util.logging.Logger;
public class List {
    private static final Logger log = Logger.getLogger(List.class.getName());
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.get(0);+
        l.contains(1);
        l.remove(0);
        System.out.println(l);
        log.info(l.toString());
    }
}
