package Day_2.q2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class City {
    public static void main(String[] args) {
        List<String> city = Arrays.asList("Hyderabad","Chennai","Bangalore","Mumbai","Davanagere");
        city.sort(Comparator.reverseOrder());
        for(String s : city){
            System.out.println(s);
        }
    }
}

