public class Employee implements Cloneable{
    int age;
    double salary;
    Date join_date;

    public Employee(int age, double salary, int join_date){
        this.age = age;
        this.salary = salary;
        this.join_date = new Date(join_date);
    }

    // Implementing DEEP cloing
    public Employee clone(){
        try{
            Employee o = (Employee) super.clone();
            Date new_date = (Date) join_date.clone();
            o.join_date = new_date;
            return (Employee) o;

        } catch(CloneNotSupportedException e) { return null;}
    }
}