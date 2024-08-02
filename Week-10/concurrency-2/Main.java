public class Main{
    public static void main(String[] args){
        Parallel p1 = new Parallel();
        Parallel p2 = new Parallel();
        Parallel p3 = new Parallel();


        // Need to convert a Runnable type to Thread
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        // Running in parallel
        t1.start();
        t2.start();
        t3.start();
    }
}