import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birthday {
    public void age(String birthDate) throws Exception {
        LocalDate d1 = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate c1 = LocalDate.now();
        if(d1.isBefore(c1)) {
            Period p = Period.between(d1, c1);
            System.out.println("Your age is "+p.getYears());

        }else if(d1.isAfter(c1)){
            System.out.println("Date should not be in the future");
        }else {
            InvalidDateFormat ife = new InvalidDateFormat("Invalid Date format");
            throw ife;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Birthday bd = new Birthday();

        System.out.println("Enter your birth date in dd-MM-yyyy format to know your age:");
        String bday = sc.nextLine();

        try {
            bd.age(bday);
        }catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid Date Format");
        }

    }
}

class InvalidDateFormat extends Exception{
    public InvalidDateFormat(String error){
        super(error);
    }

}
