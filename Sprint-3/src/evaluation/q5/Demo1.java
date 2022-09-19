package evaluation.q5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Address implements Serializable {
    String State;
    String city;
    String pincode;

    public Address(){

    }

    public Address(String state, String city, String pincode) {
        State = state;
        this.city = city;
        this.pincode = pincode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}

class Student implements Serializable{
    int roll;
    String name;
    int marks;
    String email;
    transient String password;
    Address address;

    public Student(){

    }

    public Student(int roll, String name, int marks, String email, String password, Address address) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Dev", 500, "dev@gmail.com", "12345@", new Address("Karnataka", "Bangalore", "566001")));
        list.add(new Student(2, "Raj", 400, "raj@gmail.com", "gdhdjhd", new Address("TamilNadu", "Chennai", "585001")));
        list.add( new Student(3, "Kumar", 530, "kumar@gmail.com", "51g5d4gf5", new Address("Maharashtra", "Mumbai", "666001")));
        list.add(new Student(4, "Vinod", 620, "vinod@gmail.com", "fg4db4x65", new Address("West Bengal", "Kolkatta", "756001")));
        list.add(new Student(5, "Manu", 420, "manu@gmail.com", "rhgfjhb", new Address("Kerala", "Kochi", "566454")));

        FileOutputStream fo = new FileOutputStream("studentdata.txt");
        ObjectOutputStream os = new ObjectOutputStream(fo);

        os.writeObject(list);
        os.close();

        System.out.println("Serialization is complete...");
    }
}
