package evaluation.q4;

class Kohli extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}

class Dhoni extends Thread{
    int sum = 0;
    @Override
    public void run() {
        for(int i=1; i<=20; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

class Rohit extends Thread{
    int product = 1;

    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            product = product*i;
        }
        System.out.println(product);
    }
}

public class Main {
    public static void main(String[] args) {
        Kohli k1 = new Kohli();
        Dhoni d1 = new Dhoni();
        Rohit r1 = new Rohit();

       d1.setPriority(10);

       k1.setName("Kohli");
       d1.setName("Dhoni");
       r1.setName("Rohit");

        System.out.println(d1.getName()+" thread is printing:");
       d1.start();
        try {
            d1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------------");
        System.out.println(r1.getName()+" thread is printing:");
        r1.start();
        try {
            r1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------------");
        System.out.println(k1.getName()+" thread is printing:");
        k1.start();


    }
}
