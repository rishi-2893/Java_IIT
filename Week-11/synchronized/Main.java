public class Main {
    public static void main(String[] args) {
        Synchronized a = new Synchronized();

        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(a);
        t1.start();

        Thread t2 = new Thread(a);
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long totalTimeInSeconds = (endTime - startTime) / 1000;

        System.out.println("Total time in seconds: " + totalTimeInSeconds);
        // Took 12sec which means no method ran parallel - as all are synchronized
    }
}