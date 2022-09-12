package evaluation.q2;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Student> p = i -> i.marks>500;
        System.out.println(p.test(new Student(1,"Dev",550)));
        System.out.println(p.test(new Student(2,"Raj",430)));
        System.out.println(p.test(new Student(3,"Kumar",550)));
    }
}
