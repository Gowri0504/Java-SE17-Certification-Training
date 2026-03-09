import java.util.*;
import java.util.logging.Logger;

public class p5 {

    // first non repeating number in list 4,5,1,2,0,4,5,2
    public static final Logger log = Logger.getLogger(p5.class.getName());

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,5,1,2,0,4,5,2);

        HashMap<Integer,Integer> map = new HashMap<>();

        // count frequency
        for(Integer num : list){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        // find first non repeating
        for(Integer num : list){
            if(map.get(num) == 1){
                log.info("First non repeating number: " + num);
                break;
            }
        }
    }
}