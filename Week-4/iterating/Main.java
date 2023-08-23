import java.util.Iterator;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        // Creating an Array
        char[] arr1 = new char[3];
        arr1[0] = 'a';
        arr1[1] = 'b';
        arr1[2] = 'c';


        // Creating an array
        int[] arr2 = {4, 2, 1};


        // METHOD 1: Iterating using C-type for-loop
        for (int i=0; i < arr1.length; i++)
            System.out.println(arr1[i]);
            
            // METHOD 2: Iterating using Enhanced for-loop
        for (Integer i : arr2)
            System.out.println(i);


        // METHOD 3: Using iterator
        Iterator<Integer> it = Arrays.stream(arr2).iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}