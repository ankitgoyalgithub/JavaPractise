import java.util.concurrent.TimeUnit;

public class Multidimensional{
    int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    Thread th = null;
    private int id;

    public Multidimensional(int id)
    {
        this.th = new Thread(new Runnable(){
        
            @Override
            public void run()
            {
                System.out.println("Tread started..: "+id);

                try{
                    TimeUnit.SECONDS.sleep(5-id);

                }
                catch(Exception e)
                {

                }
        
                for (int i = 0; i < 5; i++) {
                    System.out.print(array[id][i]);
                }
                System.out.println();
            }
        });
        this.id = id;
    }
    
    

    public static void main(String[] args) {
        Multidimensional[] multidimensional = new Multidimensional[5];
        for (int i = 0; i < 5; i++) {
            multidimensional[i] = new Multidimensional(i);
        }

        for (int i = 0; i < 5; i++) {
            multidimensional[i].th.start();
        }
    }
}