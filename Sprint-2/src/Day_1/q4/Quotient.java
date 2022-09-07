package Day_1.q4;

import java.util.Scanner;

public class Quotient {
    int a;
    int b;

    void display() {

        try {
            int quotient = a/b;
            System.out.println("The quotient of "+a+"/"+b+" = "+quotient);
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        System.out.println("Inside finally block");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quotient q = new Quotient();

        System.out.println("Enter first integer:");
        int num1 = sc.nextInt();
        q.a=num1;

        System.out.println("Enter second integer:");
        int num2 = sc.nextInt();
        q.b= num2;

        q.display();

    }
}
