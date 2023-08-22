import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sin = new Scanner(System.in);

        boolean on=true;
        while(on){
            System.out.println("P - Print numbers");
            System.out.println("A - Add a number");
            System.out.println("M - Display mean of the numbers");
            System.out.println("Q - Quit\n\n");
            try{run(list, sin);}
            catch(Exception e) {on = false;}
            
        }
        
    }


    // PRINT THE ARRAY
    public static void print(ArrayList<Integer> l){
        if (l.isEmpty()){
            System.out.println("[] - The list is empty");
        } else {
            System.out.print("[ ");
            for (Integer i : l){
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
    }

    // ADD ELEMENT TO THE ARRAY
    public static void add_element(ArrayList<Integer> l, Scanner sin){
        System.out.print("Enter the number to add: ");
        l.add(sin.nextInt());
    }

    // MEAN OF NUMBERS
    public static void mean(ArrayList<Integer> l){
        int sum = 0 ;
        for (Integer num : l){
            sum += num;
        }
        System.out.println("Mean: " + ((double)sum / l.size()));
    }

    // QUIT THE PROGRAM
    public static void quit() throws Exception{
        throw new Exception();
    }

    // RUNNER
    public static void run(ArrayList<Integer> l, Scanner sin) throws Exception{
        System.out.print("Enter your selection: ");
        String selection = sin.next();
        switch (selection.toUpperCase()) {
            case "P":
                print(l);
                break;
        
            case "A":
                add_element(l, sin);
                break;
                
            case "M":
                mean(l);
                break;
                
            case "Q":
                quit();
                break;
            
            default:
                break;
        }
    }
}