public class Employee{
    int exp;

    public Employee(int exp){
        this.exp = exp;
    }

    // Overriding toString
    public String toString(){
        return ("" + exp);
    }
}