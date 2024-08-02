import java.lang.reflect.*;

public class Main{
    public static void main(String[] args){
        
        // Creating different types of GenList objects
        GenList<Integer> gen_int = new GenList<>();
        GenList<String> gen_str = new GenList<>();


        // Information of <T> is lost
        System.out.println("gen_int: " + gen_int.getClass());
        System.out.println("gen_str: " + gen_str.getClass() + "\n\n");

        // Both are equal!
        System.out.println("gen_str == gen_int: " + (gen_str.getClass() == gen_int.getClass()) + "\n\n");


    }
}