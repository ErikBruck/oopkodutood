import java.util.ArrayList;
import java.util.List;

public class MovieCollection {
    private List<Movie> movies;

    public MovieCollection() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println(movie.getTitle() + " lisati kollektsiooni");
    }

    public void removeMovie(Movie movie) {
        if (movies.remove(movie)) {
            System.out.println(movie.getTitle() + " eemaldati kollektsioonist");
        } else {
            System.out.println(movie.getTitle() + " pole andmebaasis");
        }
    }

    public void printMovieDetails() {
        if (movies.isEmpty()) {
            System.out.println("Kollektsioon on tühi");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }
}
