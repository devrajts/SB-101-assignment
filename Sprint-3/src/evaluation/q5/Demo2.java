package evaluation.q5;

import java.io.*;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Starting Deserialization...");

        FileInputStream fi = new FileInputStream("studentdata.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);

        List<Student> newList = (List<Student>) oi.readObject();

        for(Student s : newList){
            System.out.println("Student roll : "+s.getRoll());
            System.out.println("Student name : "+s.getName());
            System.out.println("Student marks : "+s.getMarks());
            System.out.println("Student email : "+s.getEmail());
            System.out.println("Student password : "+s.getPassword());
            System.out.println("Student State : "+s.getAddress().getState());
            System.out.println("Student city : "+s.getAddress().getCity());
            System.out.println("Student pincode : "+s.getAddress().getPincode());
            System.out.println("--------------------------------");
        }

        oi.close();
        System.out.println("Deserialization is complete");
        System.out.println("---------------------------------");
        System.out.println("adding another student details to the list:");

        newList.add(new Student(6,"adi",610,"adi@gmail.com","fg44x65",new Address("Rajasthan","Jaipur","756551")));
        FileOutputStream fo = new FileOutputStream("studentdata.txt");
        ObjectOutputStream os = new ObjectOutputStream(fo);

        os.writeObject(newList);
        os.flush();
        os.close();

        System.out.println("Serialization is complete");
    }
}
