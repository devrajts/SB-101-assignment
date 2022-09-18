package MultiThreading.day4.q6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddThreadPool implements Runnable {

    int num;
    EvenOddThreadPool(int num){
        this.num=num;
    }

    @Override
    public void run() {
        if(num%2==0){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }

    }

    public static void main(String[] args) {
        EvenOddThreadPool[] evenOdd = {
                new EvenOddThreadPool(1),
                new EvenOddThreadPool(2),
                new EvenOddThreadPool(3),
                new EvenOddThreadPool(4),
                new EvenOddThreadPool(5),
                new EvenOddThreadPool(6),
                new EvenOddThreadPool(7),
                new EvenOddThreadPool(8),
                new EvenOddThreadPool(9),
                new EvenOddThreadPool(10)
        };
        ExecutorService service = Executors.newFixedThreadPool(3);

        for(EvenOddThreadPool tp : evenOdd){
            service.submit(tp);
        }
        service.shutdown();
    }
}
