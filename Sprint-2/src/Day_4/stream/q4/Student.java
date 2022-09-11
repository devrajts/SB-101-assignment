package Day_4.stream.q4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Student {
    int roll;
    String name;
    int marks;

    public Student(){

    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {

        Set<Student> st = new HashSet<>();
        st.add(new Student(1,"Dev",450));
        st.add(new Student(2, "Raj", 650));
        st.add(new Student(3, "Manu", 390));
        st.add(new Student(4, "Kumar", 730));
        st.add(new Student(5, "Vikas", 200));

        Set<Student> st2 = st
                .stream()
                .filter(s -> s.marks<500)
                .collect(Collectors.toSet());

        for(Student s : st2){
            System.out.println("Student roll : "+s.roll);
            System.out.println("Student name : "+s.name);
            System.out.println("Student marks : "+s.marks);
            System.out.println("-------------------------------");
        }
    }
}
