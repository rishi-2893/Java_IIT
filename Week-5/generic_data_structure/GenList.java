import java.util.ArrayList;

public class GenList<T>{
    ArrayList<T> arr = new ArrayList<>();

    public GenList(T a, T b, T c){
        arr.add(a);
        arr.add(b);
        arr.add(c);
    }

    public void print(){
        for (T e : arr) System.out.print(e  + " ");
    }
}