package Day_2.q4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintList ps = (List<String>city) -> {
            for(String s : city){
                System.out.println(s);
            }
        };
        ps.display(Arrays.asList("Bangalore","Chennai","Hyderabad","Mumbai"));
    }
}

interface PrintList{
    abstract void display(List<String>city);
}
