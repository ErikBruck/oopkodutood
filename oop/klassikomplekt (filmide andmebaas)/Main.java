public class Main {
    public static void main(String[] args) {
        // loob kollektsiooni
        MovieCollection movieCollection = new MovieCollection();

        // loob filmi
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010);
        Movie movie2 = new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999);

        // addib filmi kollektsiooni
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);

        // prindib filmi detailid
        System.out.println("\nMovie details:");
        movieCollection.printMovieDetails();

    }
}
