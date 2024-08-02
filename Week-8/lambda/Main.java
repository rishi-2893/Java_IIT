public class Main {
    public static void main(String[] args) {
        
        double squared = receive_lambda(((num) -> num * num), 25);
        System.out.print(squared);
    }

    public static double receive_lambda(MyLambda lambda, double num) {
        return lambda.square(num);
    }
}
