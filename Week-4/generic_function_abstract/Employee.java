public class Employee extends Comparable{
    int experience;
    

    // Constructor
    public Employee(int exp){
        experience = exp;
    }

    public int cmp(Comparable c){
        if (c instanceof Employee){
            // Type cast to Employee
            Employee e = (Employee) c;

            // Comparing
            if (e.experience > this.experience)
                return -1;
            else if (e.experience < this.experience)
                return 1;
            else return 0;
        }
        return 999;
    }
}