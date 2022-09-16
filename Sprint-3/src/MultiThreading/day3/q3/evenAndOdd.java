package MultiThreading.day3.q3;

class Even extends Thread{
    @Override
    public void run() {
        System.out.println("Even numbers");
        System.out.println("--------------------------------");
        for(int i=1; i<=20; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("-------------------------");
    }
}

class Odd extends Thread{
    @Override
    public void run() {
        System.out.println("Odd numbers");
        System.out.println("-------------------------");
        for(int j=1; j<=20; j++){
            if(j%2 != 0){
                System.out.println(j);
            }
        }
    }
}
public class evenAndOdd {
    public static void main(String[] args) {
        Even e = new Even();
        Odd  o = new Odd();

        e.start();
        try {
            e.join();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        o.start();
    }

}
