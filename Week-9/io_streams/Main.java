import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // ---------INPUT1.TXT----------
        try{
            // Creating streams
            var fin = new FileInputStream("./input1.txt");
            var sin = new Scanner(fin);
            
            // Scan next line
            System.out.println(sin.nextLine());
            
            // Scan Integer
            System.out.println(sin.nextInt());
            
            // Scan Integer again, exception this time
            System.out.println(sin.nextInt());
        }
        catch(FileNotFoundException e) {System.out.print("FilenNotFound");}
        catch(InputMismatchException e) {System.out.print("InputMismatchException");}
        
        
        
        // ---------OUTPUT1.TXT----------
        try{
            // Creating streams
            var fout = new FileOutputStream("./output1.txt");
            var pout = new PrintWriter(fout);

            // Writing lines
            pout.println("Hello, this is line 1");
            pout.println("Hello, this is line 2");
            pout.flush();
        }
        catch(FileNotFoundException e) {System.out.print("FilenNotFound");}



        // --------READING BINARY FILE - Main.class--------
        try{
            // creating streams
            var fin = new FileInputStream("./Main.class");
            var din = new DataInputStream(fin);

            // Scanning data and printing
            System.out.print("\n\nBinary Data: " + din.readInt());
            System.out.print("\n\nBinary Data: " + din.readFloat());
        } catch(Exception e) {}
    }
}