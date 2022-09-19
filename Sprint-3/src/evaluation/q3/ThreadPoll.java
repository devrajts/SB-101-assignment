package evaluation.q3;

import java.util.concurrent.*;

public class ThreadPoll implements Callable {

    int number;

    public ThreadPoll(int number){
        this.number=number;
    }
    @Override
    public Object call() throws Exception {
        int product = 1;

        for(int i=1; i<=number; i++){
            product = product*i;
        }
        System.out.println(Thread.currentThread().getName()+" is giving the product of "+number);
       return product;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoll[] tp = {
                new ThreadPoll(2),
                new ThreadPoll(3),
                new ThreadPoll(4),
                new ThreadPoll(5),
                new ThreadPoll(6),
                new ThreadPoll(7),
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(ThreadPoll t1 : tp){
            Future f1 = service.submit(t1);
            System.out.println(f1.get());
        }
        service.shutdown();
    }
}
