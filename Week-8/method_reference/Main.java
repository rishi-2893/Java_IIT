public class Main {
    public static void main(String[] args) {
        // Method reference to a static method
        MyFunction myFunction = MyUtils::myStaticMethod;
        myFunction.perform();
    }
}