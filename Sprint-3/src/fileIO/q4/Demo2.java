package fileIO.q4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Starting Deserialization...");
        System.out.println("--------------------------------");


        FileInputStream fi = new FileInputStream("studentdata.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);

        List<Student> list = (List<Student>) oi.readObject();

        for(Student s : list){
            System.out.println("Student roll : "+s.getRoll());
            System.out.println("Student name : "+s.getName());
            System.out.println("Student marks : "+s.getMarks());
            System.out.println("Student State : "+s.getAddress().getState());
            System.out.println("Student city : "+s.getAddress().getCity());
            System.out.println("Student pincode : "+s.getAddress().getPinCode());
            System.out.println("--------------------------------");

        }
        fi.close();
        oi.close();
        System.out.println("Deserialization is complete.");
    }
}
