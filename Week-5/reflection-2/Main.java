import java.lang.reflect.*;

public class Main{
    public static void main(String[] args){

        // Object
        Employee e = new Employee();

        // Class object
        Class c = e.getClass();

        // Getting fields - Only PUBLIC fields are printed
        Field[] fields = c.getFields();
        System.out.println("-------getFields()---------");
        for (Field f : fields){
            System.out.println(f.getName());
            System.out.println(f.getType());
            System.out.println(f.getModifiers());
            System.out.println("----------------\n\n");
            
        };
        
        // Getting fields - ALL fields are printed
        Field[] fields_all = c.getDeclaredFields();
        System.out.println("-------getDeclaredFields()---------");
        for (Field f : fields_all){
            System.out.println(f.getName());
            System.out.println(f.getType());
            System.out.println(f.getModifiers());
            System.out.println("----------------\n\n");
            
        };

    }
}