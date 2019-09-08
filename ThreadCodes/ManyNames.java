class NameRunnable implements Runnable {
    public void run(){
        for(int i=0; i < 40; i++){
            System.out.println("Run By" + Thread.currentThread().getName() + " X is " + i);
        }
    }
}

class ManyNames {
    public static void main(String args[]){
        NameRunnable nr = new NameRunnable();

        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);

        one.setName("Fred");
        two.setName("Lucy");
        three.setName("Ricky");

        one.start();
        two.start();
        three.start();
    }
}