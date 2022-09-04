import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of main..");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter num1");
            String str1 = sc.next();
            int num1  = Integer.parseInt(str1);


            System.out.println("Enter num2");
            String str2 = sc.next();
            int num2  = Integer.parseInt(str2);

            String message = null;
            int num3 = num1 / num2;
            if(num3 > 10){
                message = "Welcome to Exception Handling ";
            }
            System.out.println("Message is :"+message.toUpperCase());
        }
        catch(ArithmeticException ae) {
            System.out.println("num2 should not be 0");
        }
        catch(NumberFormatException nf) {
            System.out.println("Please Enter valid Number");
        }
        catch(NullPointerException np) {
            System.out.println("String value is null");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end of main");

    }
}
