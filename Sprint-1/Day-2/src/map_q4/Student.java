package map_q4;

import java.util.*;

public class Student implements Comparator<Student>{
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
        Map<String,Student> mp = new HashMap<>();
        mp.put("Karnataka", new Student(1,"Dev",25));
        mp.put("Tamilnadu", new Student(2,"Raj",19));
        mp.put("Maharashtra", new Student(3,"Kumar",20));

        Set<Map.Entry<String,Student>> set = mp.entrySet();

        for(Map.Entry<String,Student> me:set){
            System.out.println("Toppers Student of State :" + me.getKey());


            Student student = me.getValue();

            System.out.println("Roll :" + student.getRoll());
            System.out.println("Name :" + student.getName());
            System.out.println("Marks :" + student.getMarks());
            System.out.println("-----------------------------------");
        }
    }
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMarks() > o2.getMarks()) {
            return 1;
        }else if(o1.getMarks() < o2.getMarks()) {
            return -1;
        }else
            return 0;
    }
}
