package MultiThreading.day4.q1;

public class Product extends Thread{
    int product = 1;
    @Override
    public void run() {

        synchronized (this){
            for(int i=1; i<=10; i++){
                product = product*i;
            }
            this.notify();
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.start();

        synchronized (p1){
            try {
                p1.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(p1.product);
    }
}
