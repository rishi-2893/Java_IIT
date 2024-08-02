public class Main{
    public static void main(String[] args){
        Employee e = new Manager();
        System.out.println(e.salary(12));
        
        // We need to type cast to Manager to access the car() method
        ((Manager) e).car();
    }
}