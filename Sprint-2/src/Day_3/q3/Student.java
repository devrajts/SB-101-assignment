package Day_3.q3;

import java.util.*;

public class Student {
    private int roll;
    private String name;
    private String email;
    private int marks;

    public Student(){

    }

    public Student(int roll, String name, String email, int marks) {
        this.roll = roll;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class Demo{

    public Map<String, Student> sortMapUsingStudentName(Map<String, Student> originalMap){

        Comparator<Map.Entry<String,Student>> sort = (e1,e2) -> {
            return e1.getValue().getName().compareToIgnoreCase(e2.getValue().getName());

        };
        Set<Map.Entry<String,Student>> set = originalMap.entrySet();
        Set<Map.Entry<String,Student>> sortedSet = new TreeSet<>(sort);
        sortedSet.addAll(set);

        LinkedHashMap<String,Student> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<String,Student> s:sortedSet){
            sortedMap.put(s.getKey(),s.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Map<String,Student> map = new HashMap<>();
        map.put("India",new Student(1,"Dev","dev@gmail.com",500));
        map.put("Canada",new Student(2,"Peter","peter@gmail.com",600));
        map.put("USA",new Student(3,"John","john@gmail.com",450));
        map.put("UAE",new Student(4,"Aman","aman@gmail.com",430));
        map.put("UK",new Student(5,"Bob","bob@gmail.com",300));

        Map<String,Student> finalMap = d1.sortMapUsingStudentName(map);

        for(Map.Entry<String,Student> m : finalMap.entrySet()){
            System.out.println("Student Country : "+m.getKey());

            Student s1 = m.getValue();
            System.out.println("Student id : "+s1.getRoll());
            System.out.println("Student Name : "+s1.getName());
            System.out.println("Student Email : "+s1.getEmail());
            System.out.println("Student Marks : "+s1.getMarks());
            System.out.println("---------------------------------------");
        }

    }

}
