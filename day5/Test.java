import java.util.*;
public class Test{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        //pass in array list
            List<String> sublist = new ArrayList<>(list.subList(1, 3));
            Iterator it = sublist.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

            System.out.println(list.add("day5"));
            

        List<String> sublist = list.subList(1, 3);
        list.add("Programming");
        System.out.println(sublist);
    }
}