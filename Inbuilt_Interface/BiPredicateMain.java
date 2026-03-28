package Inbuilt_Interface;


import java.io.IO;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateMain {
    public static void main(String[] args) {

        BiPredicate<String, String> biPred = (a, b) -> a.equals(b);
        IO.println(biPred.test("nisha","nisha"));

        BiFunction<String, String, String> fun = (x,y)-> x+" "+y;
        IO.println(fun.apply("nisha","mishra"));

        BiFunction<String, String, Boolean> fun1 = (a,b)-> a.length()>b.length();

        IO.println(fun1.apply("sprinderman","superman"));

    }

}
