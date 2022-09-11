package Day_4.stream.q2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    private Integer roll;
    private String name;
    private Integer marks;

    public Student(){

    }

    public Student(Integer roll, String name, Integer marks) {
        super();
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}

class Main{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Dev", 500));
        list.add(new Student(2, "Raj", 850));
        list.add(new Student(3, "Manu", 890));
        list.add(new Student(4, "Kumar", 730));
        list.add(new Student(5, "Vikas", 600));

        List<Student> StudentWithMaxMarks = list
                .stream()
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .toList();

        for(Student s : StudentWithMaxMarks) {
            System.out.println("Student Roll : "+s.getRoll());
            System.out.println("Student Name : "+s.getName());
            System.out.println("Student Marks : "+s.getMarks());
            System.out.println("-----------------------------------");
        }
    }
}
