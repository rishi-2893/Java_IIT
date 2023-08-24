public class Main{
    public static void main(String[] args){
        Thread t = new Thread(new Run());

        Thread t2 = new Thread(new Run());

        System.out.println(t.getState());
        
        t.start();
        System.out.println(t.getState());
        
        try{t.wait(100);} catch(Exception e){};
        System.out.println(t.getState());
        
        System.out.println(t.getState());
        
        
        t2.interrupt();
        System.out.println(t2.interrupted());
    }
}