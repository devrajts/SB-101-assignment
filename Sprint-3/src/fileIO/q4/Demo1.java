package fileIO.q4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Address implements Serializable {
    String state;
    String city;
    String pinCode;

    public Address(){

    }

    public Address(String state, String city, String pincode) {
        this.state = state;
        this.city = city;
        this.pinCode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}

class Student implements Serializable{
    int roll;
    String name;
    int marks;
    Address address;

    public Student(){

    }

    public Student(int roll, String name, int marks, Address address) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
public class Demo1 {
    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Dev", 500,  new Address("Karnataka", "Bangalore", "566001")));
        list.add(new Student(2, "Raj", 400,  new Address("TamilNadu", "Chennai", "585001")));
        list.add(new Student(3, "Kumar", 530,  new Address("Maharashtra", "Mumbai", "666001")));
        list.add(new Student(4, "Vinod", 620,  new Address("West Bengal", "Kolkatta", "756001")));
        list.add(new Student(5, "Manu", 420,  new Address("Kerala", "Kochi", "566454")));

        FileOutputStream fo = new FileOutputStream("studentdata.txt");
        ObjectOutputStream os = new ObjectOutputStream(fo);

        os.writeObject(list);
        os.flush();
        os.close();

        System.out.println("Serialization is complete.");
    }
}
