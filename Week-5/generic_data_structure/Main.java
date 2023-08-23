public class Main{
    public static void main(String[] args){

        GenList<Employee> list1 = new GenList<>(new Employee(2), new Employee(2), new Employee(2));
        
        GenList<Integer> list2 = new GenList<>(33, 12, 123);

        list1.print();
        
        list2.print();
    }
}