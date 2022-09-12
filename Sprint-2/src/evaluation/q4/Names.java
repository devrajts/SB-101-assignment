package evaluation.q4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("devraj","kumar","ravi","adi","rahul","robert","peter","thor","spiderman","hulk");

        List<String> list1 = list.stream()
                .filter(n -> n.length()%2==0)
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Names before filter:");
        System.out.println("---------------------------------");
        for(String n : list){
            System.out.println(n);
        }

        System.out.println("---------------------------------");
        System.out.println("Names after filter:");
        System.out.println("---------------------------------");
        for(String s : list1){
            System.out.println(s);
        }
    }
}
