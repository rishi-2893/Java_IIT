public class Date {
    int day, month, year;

    // Constructor
    public Date(int day, int month, int year){  
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    // COPY CONSTRUCTOR
    public Date(Date d){
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }
}