package Day_4.stream.q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10,12);

        Stream<Integer> ss = list.stream();

        List<String> lt = ss.map(s -> "Square of " + s + " is " + s * s).toList();

        lt.stream().forEach(k -> System.out.println(k));
    }
}
