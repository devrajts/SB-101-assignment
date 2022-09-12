package evaluation.q3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int roll;
    private String name;
    private int marks;
    private String address;

    public Student(){

    }

    public Student(int roll, String name, int marks, String address) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Employee{
    private int empId;
    private String name;
    private int salary;
    private String address;

    public Employee(){

    }

    public Employee(int empId, String name, int salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Main{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Dev",590,"Davanagere"));
        list.add(new Student(2,"Raj",450,"Bangalore"));
        list.add(new Student(3,"Kumar",600,"Delhi"));
        list.add(new Student(4,"Gagan",550,"Mangalore"));
        list.add(new Student(5,"Adi",490,"Jaipur"));

        List<Employee> emp = list.stream()
                .filter(Student -> Student.getMarks() > 500)
                .map(s -> new Employee(s.getRoll(), s.getName(), s.getMarks() * 10000, s.getAddress()))
                .toList();

        for(Employee e : emp){
            System.out.println("Employee id : "+e.getEmpId());
            System.out.println("Employee name : "+e.getEmpId());
            System.out.println("Employee salary : "+e.getSalary());
            System.out.println("Employee address : "+e.getAddress());
            System.out.println("---------------------------------------");
        }
    }
}
