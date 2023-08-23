import java.lang.reflect.*;

public class Main{
    public static void main(String[] args){

        // Objects
        Employee e = new Employee();
        Manager m = new Manager();


        //  getClass()
        System.out.println("e.getClass(): " + e.getClass());
        System.out.println("m.getClass(): " + m.getClass() + "\n\n\n");
        
        
        // Check if two objects belong to the same class
        boolean same_class = (e.getClass() == m.getClass());
        System.out.println("same_class: " + same_class + "\n\n\n");


        // Creating instance of class
        String class_name = "Employee";
        try{
            Class c = Class.forName(class_name);

            // throws exception
            Object o = c.newInstance();

            System.out.println("Class created: " + o.getClass() + "\n\n");
        }
        catch(Exception exception) {}

    }
}