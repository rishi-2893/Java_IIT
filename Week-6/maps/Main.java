import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Main{
    public static void main(String[] args){

        // Creating a hash map
        HashMap<String, Integer> marks = new HashMap<>();

        // Adding values to hash map
        marks.put("Rishi", 12);
        print(marks);
        
        marks.put("Elon", 97);
        print(marks);
        
        
        // Updating values - putting if absent
        marks.putIfAbsent("Elon", 120);
        print(marks);
        
        // Updating values - Merging
        marks.merge("Rishi", 100, Integer::sum);
        print(marks);
        
        // Getting real value or the default value
        marks.put("Elon", marks.getOrDefault("Elon", 0));
        print(marks);
    }

    public static void print(HashMap<String, Integer> map){
        
        // Getting set of values 
        System.out.println("\n------KEYS------");
        Set<String> keys = map.keySet();
        for (String s : keys ) System.out.print( s + " ");
        
        // Getting Collection of values
        System.out.println("\n------VALUES------");
        Collection<Integer> values = map.values();
        for (Integer s : values ) System.out.print( s + " ");
        
        // Getting key value pairs
        System.out.println("\n------KEY-VALUES------");
        Set<Map.Entry<String,Integer>> entry_set = map.entrySet();
        for (Map.Entry<String,Integer> s : entry_set ) System.out.print( s.getKey() +":" + s.getValue() + " ");

    }
}