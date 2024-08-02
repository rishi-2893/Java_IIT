public abstract class Shape{
    
    // Concrete component
    public boolean has_area(){
        return true;
    }

    // Abstract component
    public abstract float perimeter();
}