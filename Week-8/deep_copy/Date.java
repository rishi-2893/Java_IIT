public class Date implements Cloneable{
    int day;
    public Date(int day){
        this.day = day;
    }

    public Object clone(){
        try{
            return super.clone();

        } catch(CloneNotSupportedException e) { return null;}
    }
}