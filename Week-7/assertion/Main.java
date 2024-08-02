public class Main{
    public static void main(String[] args){
        root(-21.2);
    }

    public static double root(double pos_number){
        assert pos_number >= 0 : pos_number + ": is less than zero";

        return Math.sqrt(pos_number);
    }
}