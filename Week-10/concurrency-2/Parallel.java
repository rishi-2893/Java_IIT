public class Parallel implements Runnable{
    private static int count = 0;
    private int id;


    public Parallel(){ count++; id = count;}

    public void run(){
        for (int i =0; i < 3; i++){
            System.out.println("id: " + id + " loop no.: " + i);
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }   

}