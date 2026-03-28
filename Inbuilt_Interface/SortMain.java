package Inbuilt_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SortMain {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        //0: index
        list.add(new Student("Aman",15,6,"lvg"));
        //1
        list.add(new Student("nisha",20,6,"kvv"));
        //2
        list.add(new Student("Rahul", 16, 10, "dps"));
        //3
        list.add(new Student("Sanya", 17, 11, "kvv"));
        list.add(new Student("Vikram", 15, 9, "svn"));
        list.add(new Student("Priya", 18, 12, "bvb"));
        list.add(new Student("Arjun", 14, 8, "lvg"));
        list.add(new Student("Anjali", 16, 10, "kvv"));
        list.add(new Student("Rohan", 19, 12, "dps"));
        list.add(new Student("Sneha", 15, 9, "svn"));

        Collections.sort(list);

        for(Student i : list){
            System.out.println(i);
        }

    }
}
