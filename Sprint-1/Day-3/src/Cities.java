import java.util.*;

public class Cities {
    public static void main(String[] args) {
        //List<String> list;
        Map<String, List> cities = new HashMap<>();

        cities.put("Karnataka", Arrays.asList("Bangalore", "Mangalore","Davanagere","Hubli"));
        cities.put("TamilNadu", Arrays.asList("Chennai", "Coimbatore","Madurai","Salem","Tanjavur"));
        cities.put("Maharashtra", Arrays.asList("Mumbai","Pune","Nagpur","Thane","Akola"));
        cities.put("Gujarat", Arrays.asList("Ahmedabad","Surat","Rajkot","Jamnagar","Junagadh"));
        cities.put("Telangana", Arrays.asList("Hyderabad","Warangal","Karimnagar","Nalgonda","Nizamabad"));

        Set<Map.Entry<String,List>> kv = cities.entrySet();

        for(Map.Entry<String,List> s : kv){
            System.out.println(s.getKey()+" state has  "+s.getValue()+" cities.");
        }
    }
}
