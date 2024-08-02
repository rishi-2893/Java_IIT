import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String[] args){

        //------ITERATING ARRAYLIST------
    
        // Building
        ArrayList<Integer> arr_list = new ArrayList<>();
        arr_list.add(3);
        arr_list.add(1);
        arr_list.add(10);

        // Iterating
        Iterator arr_list_it = arr_list.iterator();
        while (arr_list_it.hasNext())
            System.out.print( arr_list_it.next() +" ");

    }
}