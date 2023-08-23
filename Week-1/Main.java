import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        String string_1 = "Rishi";
        String string_2 = "Patel";
        ArrayList<Integer> list = new ArrayList<>();

        pass_by_reference(string_1, string_2, list);
        
        System.out.println("string1: "+ string_1); // Remains the same: Rishi
        System.out.println("string2: "+ string_2); // Remains the same: Patel
        System.out.println("Size of ArrayList: "+ list.size()); // UPDATED: 1
    }

    public static void pass_by_reference(String str1, String str2, ArrayList<Integer> l){
        // Updating the string
        str1 = str1.toLowerCase();

        // Referencing str2 to another string
        str2 = "PATEL";

        // Updating list
        l.add(12);
    }
}