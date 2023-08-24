import java.util.Arrays;
import java.util.List;

public class Synchronized implements Runnable{

    public void run(){
        method_one();
        method_two();
    }

    // public void method_one(){
    //     List<String> l = Arrays.asList("method_one", "method_one", "method_one");
    //     for(String e : l) {
    //         System.out.println(e);
    //         try{Thread.sleep(1000);}catch(Exception exception){}
    //     }
    // }
    
    
    // public void method_two(){
    //     List<String> l = Arrays.asList("method_two", "method_two", "method_two");
    //     for(String e : l) {
    //         System.out.println(e);
    //         try{Thread.sleep(1000);}catch(Exception exception){}
    //     }
    // }


    public synchronized void method_one(){
        List<String> l = Arrays.asList("method_one", "method_one", "method_one");
        for(String e : l) {
            System.out.println(e);
            try{Thread.sleep(1000);}catch(Exception exception){}
        }
    }
    
    
    public synchronized void method_two(){
        List<String> l = Arrays.asList("method_two", "method_two", "method_two");
        for(String e : l) {
            System.out.println(e);
            try{Thread.sleep(1000);}catch(Exception exception){}
        }
    }
}