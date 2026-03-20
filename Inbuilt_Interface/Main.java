package Inbuilt_Interface;


import java.io.IO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



//boolean test(T t);
public class Main {
    public static void main(String[] args) {

        Predicate<Integer> pr = a -> a % 2 == 0;
        IO.println(pr.test(5));

        Predicate<String> pr1 =  str -> str.length()>5;
         IO.println(pr1.test("Kejriwal"));


        Predicate<Student> pr2 = std -> std.getAge() >= 18;

        Student student = new Student("nisha",20,6,"kvv");

        Student student1 = new Student("Aman",15,6,"lvg");

        IO.println("is this student more than 18 age: "+pr2.test(student));

        IO.println("is this student more than 18 age: "+pr2.test(student1));


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


        for(int i =0; i<list.size();i++){
            IO.println(list.get(i).getName()+ " age is greater than or equal 18: "+pr2.test(list.get(i)));
        }

    }

}
