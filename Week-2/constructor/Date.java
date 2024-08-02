public class Date {
    int day, month, year;

    // Constructor
    public Date(int day, int month, int year){  
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // OVERLOADING using the above constructor
    public Date(int day){
        this(day, 9, 2003);
    }

    public static void main(String[] args){
        
    }
}
