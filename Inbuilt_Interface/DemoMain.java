package Inbuilt_Interface;

import java.io.IO;

@FunctionalInterface
interface Caculator {
    public int calculate(int a, int b);
}

public class DemoMain {
    public static void main(String[] args) {
        Caculator add = (a, b) -> {
            return a + b;
        };

        IO.println(add.calculate(25, 25));

        Caculator mul = (x, y) -> x * y;

    }
}
