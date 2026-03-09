import java.util.*;
import java.util.logging.Logger;

public class Map {

    public static final Logger log = Logger.getLogger(Map.class.getName());

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "one");
        map.put(2, "two");

        log.info("Value for key 1: " + map.get(1));
        log.info("Value for key 2: " + map.get(2));
    }
}