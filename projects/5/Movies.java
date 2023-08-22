import java.util.ArrayList;

public class Movies{
    ArrayList<Movie> list = new ArrayList<>();

    public void add_movie(String name, String rating){
        Movie m = new Movie(name, rating);
        list.add(m);
    }

    public void increment_watch_count(String movie_name){
        for (Movie m : list){
            if (m.get_name() == movie_name){
                m.set_watch_count(m.get_watch_count() + 1);
                return;
            } 
        }
        System.out.println("Sorry, you haven't added this movie yet!");
    }

    public void display_movies(){
        for (Movie m : list){
            System.out.println(m.name + ", " + m.rating + ", " + m.get_watch_count());
        }
    }
}