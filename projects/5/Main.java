import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Movies movies = new Movies();
        Scanner sin = new Scanner(System.in);
        String name;
        String rating;

        boolean on = true;
        while(on){
            System.out.println("Enter: A - add, D - display, I - increment");
            String selection = sin.next();

            switch (selection){
                case "A":
                    System.out.print("Enter movie name: ");
                    name = sin.next();
                    System.out.print("Enter movie rating: ");
                    rating = sin.next();
                    movies.add_movie(name, rating);
                    break;
                case "D":
                    movies.display_movies();
                    break;
                case "I":
                    System.out.print("Enter movie name: ");
                    name = sin.next();
                    movies.increment_watch_count(name);
                    break;
            }
        }
    }
}