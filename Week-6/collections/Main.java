import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main{
    public static void main(String[] args){
        
        // ------INDIRECTION: USING GENERIC TYPE------
        
        // Collections sits at the top
        Collection<String> c = new ArrayList<>();
        c.add("null");

        // Iterating
        Iterator c_it = c.iterator();
        System.out.print(c_it.next());


        // ------TESTING member()-------
        System.out.println("\n\n" + "null Member of c: " + member(c, "null"));
        System.out.println("nullify Member of c: " + member(c, "nullify"));
        
//         List<String> arrayList = new ArrayList<>(Arrays.asList(array));


        // --------REMOVING ELEMENTS USING ITERATOR-------
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator it = arr.iterator();

        System.out.println("\n\nSize before removing: " + arr.size());
        it.next();
        it.remove();
        System.out.println("Size after removing: " + arr.size());

    }
    // ---------- GENERIC FUNCTION TO OPERATE ON COLLECTION-----
    public static <E> boolean member(Collection<E> collection, E e){
        for (E element : collection){
            if (element.equals(e))
                return true;
        }
        return false;
    }
}