public class Manager extends Employee{
    String car;
    public Manager(int experience, String car){
        super(experience);
        this.car = car;
    }

    public String toString(){
        return car;
    }
}