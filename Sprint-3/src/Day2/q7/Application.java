package Day2.q7;

public class Application implements Runnable{

    @Override
    public void run() {
        Application ap = new Application();
        Thread t1 = new Thread(ap);
        Thread t2 = new Thread(ap);
        t1.setName("Dhoni");
        t1.setPriority(8);

        t2.setName("Kohli");
        t2.setPriority(10);

        for(int i=0; i<10; i++){
            System.out.print(t1.getPriority());
            System.out.println(" "+t1.getName());
        }

        for(int j=0; j<10; j++){
            System.out.print(t2.getPriority());
            System.out.println(" "+t2.getName());
        }

    }

    public static void main(String[] args) {
        Application ap = new Application();
        ap.run();
        
    }
}
