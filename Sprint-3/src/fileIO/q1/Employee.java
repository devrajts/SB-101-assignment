package fileIO.q1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("New file is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileWriter fw = new FileWriter("abc.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name :");
        String name = sc.next();

        System.out.println("Enter Employee address :");
        String address = sc.next();

        fw.write(name);
        fw.write("\n");
        fw.write(address);

        fw.close();

        System.out.println("Employee details added successfully");
    }
}
