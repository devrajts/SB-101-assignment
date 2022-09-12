package evaluation.q2;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> s1 = () -> new Student(1,"Dev",550);
        Supplier<Student> s2 = () -> new Student(2,"Raj",430);
        Supplier<Student> s3 = () -> new Student(3,"Kumar",550);

        System.out.println("Student roll : "+s1.get().getMarks());
        System.out.println("Student name : "+s1.get().getName());
        System.out.println("Student marks : "+s1.get().getMarks());

        System.out.println("--------------------------------------");

        System.out.println("Student roll : "+s2.get().getMarks());
        System.out.println("Student name : "+s2.get().getName());
        System.out.println("Student marks : "+s2.get().getMarks());

        System.out.println("--------------------------------------");

        System.out.println("Student roll : "+s3.get().getMarks());
        System.out.println("Student name : "+s3.get().getName());
        System.out.println("Student marks : "+s3.get().getMarks());
    }
}
