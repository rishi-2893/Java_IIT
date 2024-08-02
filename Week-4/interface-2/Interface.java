public interface Interface{
    // Two types of functions can be implemented in a interface

    // Static functions can be implemented
    public static void stat(){
        return;
    }

    // Default functions
    public default void def(){
        return;
    }
}