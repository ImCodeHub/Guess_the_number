package Stream;

import Inbuilt_Interface.Student;
import Inbuilt_Interface.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        //created a list
        List<User> users = new ArrayList<>();

        users.add(new User("nisha", "mishra", 20, 6));
        users.add(new User("rahul", "sharma", 22, 8));
        users.add(new User("priya", "singh", 19, 5));
        users.add(new User("amit", "verma", 25, 10));
        users.add(new User("sneha", "gupta", 25, 7));
        users.add(new User("rohit", "yadav", 23, 9));
        users.add(new User("pooja", "tiwari", 18, 4));
        users.add(new User("vikas", "kumar", 24, 11));
        users.add(new User("neha", "agarwal", 20, 8));
        users.add(new User("arjun", "patel", 26, 12));


        List<Student> collect = users.stream()
                .filter(user -> user.getHeight() > 5)
                .map(user -> {
                    Student std = new Student();
                        std.setName(user.getFirstName() + " " + user.getLastName());
                        std.setAge(user.getAge());
                        std.setHeight(user.getHeight());
                        std.setSchoolName("Army school");
                    return std;
                })
                .sorted((o1,o2)->o1.getName().charAt(1)-o2.getName().charAt(1))
                .collect(Collectors.toList());


        for (Student std : collect) {
            System.out.println(std);
        }


    }
}
