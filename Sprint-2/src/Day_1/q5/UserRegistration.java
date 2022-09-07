package Day_1.q5;

import java.util.Scanner;

public class UserRegistration {
    public String registerUser(String userName, String userCountry)throws InvalidCountryException {


        if(userCountry.equalsIgnoreCase("india")) {
            System.out.println("User registration done successfully.");
            System.out.println("Thank you!");
        }else {
            InvalidCountryException ce = new InvalidCountryException("User Outside India Cannot be registered");
            throw ce;
        }

        return userCountry;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration ur = new UserRegistration();
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();


        System.out.println("Enter Your Country:");
        String country = sc.nextLine();


        try {
            ur.registerUser(name, country);
        }catch(InvalidCountryException e) {
            System.out.println(e.getMessage());
            System.out.println("Thank you!");
        }

    }
}

class InvalidCountryException extends Exception{

    public InvalidCountryException(String string) {
        super(string);
    }

}
