package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapStream {
    public static void main(String[] args) {
        List<List<Character>> listOfList = Arrays.asList(
                Arrays.asList('a','b','c'),
                Arrays.asList('d','d','e'),
                Arrays.asList('f','g','h','i','l')
        );


        List<Character> collect = listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
