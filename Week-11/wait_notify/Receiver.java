public class Receiver implements Runnable {
    private Data load;
 
    // standard constructors
    public Receiver(Data d){
        this.load = d;
    }
 
    public void run() {
        for(String receivedMessage = load.receive();
          !"End".equals(receivedMessage);
          receivedMessage = load.receive()) {
            
            System.out.println(receivedMessage);

            //Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted"); 
            }
        }
    }
}