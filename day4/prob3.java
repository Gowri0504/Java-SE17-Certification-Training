import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.HashSet;

public class prob3 {

    // get n and input list and print missing values
    public static final Logger log = Logger.getLogger(prob3.class.getName());

    public static void main(String[] args){

        int n = 10;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(9);

        log.info("Original List: " + list);

        ArrayList<Integer> missing = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(list);

        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                missing.add(i);
            }
        }

        log.info("Missing elements: " + missing);
    }
}