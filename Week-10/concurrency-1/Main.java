public class Main{
    public static void main(String[] args){
        Parallel p1 = new Parallel();
        Parallel p2 = new Parallel();
        Parallel p3 = new Parallel();

        // Running in parallel
        p1.start();
        p2.start();
        p3.start();
    }
}