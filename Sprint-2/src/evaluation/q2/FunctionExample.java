package evaluation.q2;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String,Integer> fun = s -> Integer.parseInt(s);
        System.out.println(fun.apply("500"));
    }
}
