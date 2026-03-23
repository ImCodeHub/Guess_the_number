package Inbuilt_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//R apply(T t);
public class FunctionMain {
    public static void main(String[] args) throws InterruptedException {
//      default interface of java8 (Function<T,R> interface)

        Function<String, Integer> fun = (s) -> s.length();
        System.out.println(fun.apply("Nisha"));

        Function<String, String> fun1 = (s) -> s.toUpperCase();
        System.out.println(fun1.apply("ankit"));

        Function<String, String> fun2 = (s) -> s+" mishra";
        System.out.println(fun2.apply("Nisha"));

        Function<Integer,Integer> fun3 = i -> i*i;
        System.out.println(fun3.apply(25));

        Student student = new Student("spiderman", 25,6,"tvu");

        System.out.println(student);

        Function<Student,String> fun4 = std -> std.getName().toUpperCase();
        System.out.println(fun4.apply(student));

        Function<Student,Student> fun5 = std -> {
            std.setName("superman");
            std.setHeight(7);

            return std;
        };
        System.out.println(fun5.apply(student));

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

        Function<Student, Student> fun6 =  stdnt -> {
                stdnt.setName(stdnt.getName().toUpperCase());
                return stdnt;
        };

        for(int i = 0; i<list.size(); i++){
            System.out.println(fun6.apply(list.get(i)));
            Thread.sleep(3000);
        }
    }
}
