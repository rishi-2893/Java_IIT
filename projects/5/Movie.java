public class Movie{
    String name;
    String rating;
    int watched;
    public Movie(String movie_name, String movie_rating){
        name = movie_name;
        rating = movie_rating;
        watched = 0;
    }

    public String get_name(){
        return name;
    }
    public String get_rating(){
        return rating;
    }

    public int get_watch_count(){
        return watched;
    }

    public void set_watch_count(int new_count){
        watched = new_count;
    }

}