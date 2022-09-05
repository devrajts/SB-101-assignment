import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Mobile {
    HashMap<String, ArrayList<String>> mobile = new HashMap<>();

    public String addMobile(String company, String model) {
        return model;
//		HashMap<String, ArrayList<String>> mobile = new HashMap<>();
//
    }

    public List<String> getModels(String company) throws InvalidMobileException{
        if(company.equals("apple")) {
            List<String> model = Arrays.asList("iphone13","iphone12","iphonex");
            return model;
        }else if(company.equals("samsung")) {
            List<String> model = Arrays.asList("note7","note8","note9");
            return model;
        }else
            return null;


    }

    public static void main(String[] args) {
        Mobile mb = new Mobile();



    }

}

class InvalidMobileException extends Exception {

}


