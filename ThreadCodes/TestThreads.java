class FooRunnable implements Runnable {
    public void run(){
        for(int i=0; i<6; i++){
            System.out.println("Runnable Running");
        }
    }
}

public class TestThreads{
    public static void main(String args[]){
        FooRunnable r = new FooRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}