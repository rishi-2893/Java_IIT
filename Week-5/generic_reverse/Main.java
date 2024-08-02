public class Main{
    public static void main(String[] args){

        // Using generic reverse array - String
        String[] str_arr = {"Rishi", "Satish" ,"Patel"};
        reverse_arr(str_arr);
        
        
        // Using generic reverse array - Integer
        Integer[] int_arr = {8, 390, 12};
        reverse_arr(int_arr);
        
        
        // Using generic reverse array - Employee
        Employee[] employee_arr = {new Employee(21), new Employee(12), new Employee(4)};
        reverse_arr(employee_arr);

    }

    // Generic array reverse function
    public static <T> void reverse_arr(T[] arr){
        System.out.println("\n\n------Generic Reverse-------");
        
        // Printing original array
        System.out.println("Input Array");
        for (T element : arr) System.out.print( element +" ");
        
        // Printing reversed array
        System.out.println("\n\nReversed Array");
        for (int i=arr.length-1; i >= 0; i--) System.out.print( arr[i] +" ");
    }
}