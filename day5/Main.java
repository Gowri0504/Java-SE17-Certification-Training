import java.util.*;
import java.util.ArrayList;


class Student implements Comparable<Student> {

    int age;

    Student(int age){
        this.age = age;
    }

    public int compareTo(Student s){
        return this.age - s.age;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22));
        list.add(new Student(18));
        list.add(new Student(20));

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.age);
        }
    }
}