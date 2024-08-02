public class Employee{
    int experience;
    int salaray;
    // Using the private class
    Person person;

    // Private class
    private class Person{
        String name;
        int age;
    }
}