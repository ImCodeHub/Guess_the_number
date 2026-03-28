package Inbuilt_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CustomerSortMain {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User("nisha","mishra",20,6));
        list.add(new User("rahul", "sharma", 22, 8));
        list.add(new User("priya", "singh", 19, 5));
        list.add(new User("amit", "verma", 25, 10));
        list.add(new User("sneha", "gupta", 25, 7));
        list.add(new User("rohit", "yadav", 23, 9));
        list.add(new User("pooja", "tiwari", 18, 4));
        list.add(new User("vikas", "kumar", 24, 11));
        list.add(new User("neha", "agarwal", 20, 6));
        list.add(new User("arjun", "patel", 26, 12));

        Comparator<User> sortUserByAge = (o1,o2)->o1.getAge()-o2.getAge();
        Comparator<User> sortUserByHeight = (o1,o2)-> o1.getHeight()-o2.getHeight();
        Collections.sort(list,sortUserByAge.thenComparing(sortUserByHeight));
        for(User u : list){
            System.out.println(u);
        }
    }
}
