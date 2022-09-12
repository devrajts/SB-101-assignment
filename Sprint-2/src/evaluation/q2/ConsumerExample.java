package evaluation.q2;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Student s1 = new Student(1,"Dev",550);
       //Student s2 = new Student(2,"Raj",430);
        //Student s3 = new Student(3,"Kumar",550);

        Consumer<Student> c = s ->{
            System.out.println("Student roll : "+s.roll);
            System.out.println("Student name : "+s.name);
            System.out.println("Student marks : "+s.marks);
            System.out.println("--------------------------");
        };
        c.accept(new Student(1,"Dev",550));
        c.accept(new Student(2,"Raj",430));
        c.accept(new Student(3,"Kumar",550));
    }
}
