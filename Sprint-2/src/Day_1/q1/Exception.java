package Day_1.q1;

import java.util.Scanner;

public class Exception {
    String str;

    void display() {
        try {
            int num = Integer.parseInt(str);
            int sqr = num*num;
            System.out.println("Square of "+num+" is "+sqr);
            System.out.println("Work has been done successfully");
        }
        catch(NumberFormatException nf){
            System.out.println("Enter input is not a valid format for an integer.");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exception ec = new Exception();

        System.out.println("Enter an integer:");
        String str = sc.next();

        ec.str = str;
        ec.display();

    }
}
