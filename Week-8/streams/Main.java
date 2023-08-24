import java.util.LinkedList;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args){

        // Creating stream from LinkedList
        LinkedList<Integer> linked_list = new LinkedList<>();
        linked_list.add(21);
        Stream<Integer> linked_list_stream = linked_list.stream();
        System.out.println("\nlinked_list_stream.count(): " + linked_list_stream.count());
        
        
        // Creating stream from Array
        Integer[] array = {1, 3, 3};
        Stream<Integer> array_stream = Stream.of(array);
        System.out.println("\narray_stream.count(): " + array_stream.count());


        // Generating infinite Stream
        Stream<String> inf_stream = Stream.generate(() -> "Hi");
        System.out.println("\nFirst element: " + inf_stream.findFirst());
        
        // Iterating Stream
        Stream<Integer> even_stream = Stream.iterate(0, n -> n + 2);
        System.out.print("\nFirst 5 even numbers: ");
        even_stream
        .limit(5)
        .forEach(System.out::print);
        
        
        // Using map
        String[] str_arr1 = {"rishi", "mukesh", "elon"};
        Stream<String> str_stream1 = Stream.of(str_arr1);
        System.out.print("\n\nFirst characters: ");
        str_stream1
            .map((s) -> s.subSequence(0, 1))
            .forEach(System.out::print);
}