import java.io.*;
import java.time.LocalDate;
import java.util.*;


class Animal{
    void sound(){
        IO.println("Animal can make sound");
    }
}
class Dog extends Animal{
    void bark(){
        IO.println("dog is barking");
    }
}

public class NewMain {
    public static void main(String[] args) {

        Animal ani = new Dog();

        List<Integer> list = new ArrayList<>(); // default capacity 10

        list.add(9);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(4);

        list.add(78);
        list.add(78);
        list.add(42);
        list.add(null);
        list.add(24);
        list.add(49);

        list.add(50);
        list.add(50);


        IO.println(list);
        IO.println(list.size());

        IO.println(list.getFirst());
        IO.println(list.getLast());

        IO.println(list.get(5));
        IO.println(list.contains(99));

        IO.println(list.indexOf(78));

        list.add(9,5);

        IO.println(list);





    }
}


