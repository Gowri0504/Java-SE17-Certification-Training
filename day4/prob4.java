import java.util.*;
import java.util.logging.Logger;

public class prob4 {

    public static final Logger log = Logger.getLogger(prob4.class.getName());

    public static void main(String[] args) {

        // input list
        List<String> list = Arrays.asList("java","python","python","java","java","c++");

        HashMap<String, Integer> countMap = new HashMap<>();

        for(String word : list){

            if(countMap.containsKey(word)){
                int count = countMap.get(word);
                countMap.put(word, count + 1);
            }
            else{
                countMap.put(word, 1);
            }

        }

        log.info("Word counts: " + countMap);
    }
}