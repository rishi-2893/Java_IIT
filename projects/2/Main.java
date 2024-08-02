// Imports
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        // Variables
        int SMALL_ROOMS = 25;
        int LARGE_ROOMS = 35;
        float TAX = 0.06f;

        // Input stream
        Scanner sin = new Scanner(System.in);

        // Printing info
        System.out.println("Welcome to Rishi's Carpet Cleaning");
        System.out.println("Charges: \n" + SMALL_ROOMS + "$: Small room \n" + LARGE_ROOMS + "$: Large room");
        System.out.println("Sales tax: "+TAX+"\nEstimates valid for 30 Years\n\n\n");


        // Prompting
        System.out.println("Estimate for carpet cleaning service");
        
        System.out.print("Number of small rooms: ");
        int small = sin.nextInt();
        System.out.print("Number of large rooms: ");
        int large = sin.nextInt();

        System.out.println("Price per small room: " + SMALL_ROOMS);
        System.out.println("Price per large room: " + LARGE_ROOMS);

        int cost = (SMALL_ROOMS * small) + (LARGE_ROOMS * large);
        System.out.println("Cost: " + cost);
        
        float tax = cost * TAX;
        System.out.println("Tax: " + tax);

    }
}