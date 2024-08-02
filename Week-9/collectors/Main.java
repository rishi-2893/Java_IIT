import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Main{
    public static void main(String[] args){
        
        // Converting stream to array
        Stream<Double> rand_stream1 = Stream.generate(Math::random).limit(2);
        Object[] rand_arr = rand_stream1.toArray();
        print("rand_arr", Arrays.asList(rand_arr));
        
        
        // Converting stream to more specific array
        Stream<Double> rand_stream2 = Stream.generate(Math::random).limit(2);
        Double[] rand_double_arr = rand_stream2.toArray(Double[]::new);
        print("rand_double_arr", Arrays.asList(rand_double_arr));
        
        // Converting stream to List
        Stream<Double> rand_stream3 = Stream.generate(Math::random).limit(2);
        List<Double> rand_List = rand_stream3.collect(Collectors.toList());
        print("rand_List", rand_List);
        
        // Summarizing stream
        Stream<Double> rand_stream4 = Stream.generate(Math::random).limit(2);
        DoubleSummaryStatistics summary = rand_stream4.collect(Collectors.summarizingDouble(Double::doubleValue));
        System.out.println("\n\nAverage: " + summary.getAverage());
        System.out.println("Count: " + summary.getCount() + "\n\n");
        
    }

    public static <T> void print(String name_of_collection, Collection<T> c){
        System.out.print(name_of_collection + ": ");
        for(T  e : c) System.out.print( e + " ");
        System.out.print("\n");
    }
}