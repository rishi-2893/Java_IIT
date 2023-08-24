public class Employee implements Cloneable{
    int age;
    double salary;
    Date join_date;

    public Employee(int age, double salary, int join_date){
        this.age = age;
        this.salary = salary;
        this.join_date = new Date(join_date);
    }

    // Implementing shallow cloing, Date object is not deeply copied
    public Employee clone(){
        try{
            return (Employee) super.clone();
        } catch(CloneNotSupportedException e) { return null;}
    }
}