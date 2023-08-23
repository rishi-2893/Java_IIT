import java.io.Console;

public class Main{
    public static void main(String[] args){

        // Using Console
        Console cons = System.console();
        String username = cons.readLine("Your name: ");
        System.out.print(username);
    }
}