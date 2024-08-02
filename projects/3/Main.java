import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        // Setting input stream
        Scanner sin = new Scanner(System.in);

        // Welcoming the user
        System.out.println("Hi, your job will be to input elements of a 2*2 matrix");
        System.out.print("Enter 4 integers (delimiter: ' '): ");

        // Taking the input - row 1
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(sin.nextInt());
        row1.add(sin.nextInt());

        // Taking the input - row 2
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(sin.nextInt());
        row2.add(sin.nextInt());

        // Making the matrix
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(row1);
        mat.add(row2);

        // Printing the matrix
        System.out.println("\n\n-----Printing The Matrix-----");
        for (ArrayList<Integer> row : mat) {
            for (Integer element : row){
                System.out.print("---" + element + "---");
            }
            System.out.print("\n");
        }
    }
}