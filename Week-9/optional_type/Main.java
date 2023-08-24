import java.util.Optional;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args){

        // Aggregate functions return Optional type
        Optional<Double> maxrand = Stream.generate(Math::random)
            .limit(100)
            .max(Double::compareTo);


        // Updating value of Optional using map
        maxrand = maxrand.map(v -> v * v);


        // Converting Optional<Double> to stream
        Stream<Double> maxdouble = maxrand.stream();
    }
}