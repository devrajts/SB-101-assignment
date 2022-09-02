package generics_q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of names you want to add to the list:");
        int num = sc.nextInt();

        Generics<String> g1 = new Generics<>();
        for(int i=1; i<=num; i++){
            System.out.println("Enter "+i+" name:");
            String name = sc.next();
            g1.add(name);
            System.out.println(g1.get());
        }
    }
}

class Generics<string>{
    String t;
    void add(String t){
        this.t=t;
    }
    String get(){
        return t;
    }
}
