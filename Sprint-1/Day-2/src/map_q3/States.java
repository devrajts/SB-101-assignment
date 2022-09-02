package map_q3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class States {
    public static void main(String[] args) {
        Map<String, String> states = new LinkedHashMap<>();

        states.put("Karnataka", "Bangalore");
        states.put("TamilNadu", "Chennai");
        states.put("Maharashtra", "Mumbai");
        states.put("Gujrath", "Ahamadabad");
        states.put("Telangana", "Hyderabad");

        Set<Map.Entry<String, String>> keyvalue = states.entrySet();

        for(Map.Entry<String, String> s : keyvalue) {
            System.out.println("for "+s.getKey()+" state "+s.getValue()+" is the capital city");
        }

    }
}
