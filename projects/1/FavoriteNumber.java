import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args){
        
        // Prompt the user
        System.out.println("Hi, enter your favorite number between 1-100");
        
        // Scanner to extract the user input
        Scanner sin = new Scanner(System.in);
        int fav_number = sin.nextInt();
        
        // Closing the stream
        sin.close();

        // Check if user entered valid input
        if (fav_number >= 1 && fav_number <= 100){
            System.out.println("Hurray " + fav_number + ", is my favorite number too!");
            System.out.println("No, really I am not joking!");
        } else {
            System.out.println("Mehh... Read the instructions again");
        }
    }
}