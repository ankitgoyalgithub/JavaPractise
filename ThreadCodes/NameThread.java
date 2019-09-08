class NameRunnable implements Runnable {
    public void run(){
        System.out.println("NameRUnnable Running");
        System.out.println("Run By " + Thread.currentThread().getName());
    }
}

public class NameThread {
    public static void main(String args[]){
        NameRunnable nr = new NameRunnable();
        Thread t = new Thread(nr);
        t.setName("Fred");
        t.start();
    }
}