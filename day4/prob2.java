import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Logger;

public class prob2 {
    //find all duplicate elements in the list
    public static final Logger log = Logger.getLogger(prob2.class.getName());
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//add 1,2,3,4,2,5,3,6
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(6);
        log.info("Original List: " + list);
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(Integer num : list){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }
        log.info("Duplicate elements: " + duplicates);
    }

}
