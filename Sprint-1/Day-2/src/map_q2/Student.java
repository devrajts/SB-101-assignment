package map_q2;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Student {
    private int roll;
    private String name;
    private int marks;

    public Student(){

    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Map<Student, String> ma = new TreeMap<>(new StudentComparator());
        ma.put(new Student(1,"Dev",25),"Karnataka");
        ma.put(new Student(2,"Raj",19),"Tamilnadu");
        ma.put(new Student(3,"Kumar",20),"Maharashtra");

        Set<Map.Entry<Student,String>> set = ma.entrySet();
        for(Map.Entry<Student,String> me:set){
            System.out.println("Toppers of State : "+me.getValue());

            Student student = me.getKey();
            System.out.println("Roll : "+student.getRoll());
            System.out.println("Name :" + student.getName());
            System.out.println("Marks :" + student.getMarks());
            System.out.println("--------------------------------");
        }
    }
}

class StudentComparator<Student>implements Comparator<map_q2.Student> {


    @Override
    public int compare(map_q2.Student o1, map_q2.Student o2) {
        if (o1.getMarks() > o2.getMarks()) {
            return 1;
        } else if (o1.getMarks() < o2.getMarks()) {
            return -1;
        } else
            return 0;

    }
}
