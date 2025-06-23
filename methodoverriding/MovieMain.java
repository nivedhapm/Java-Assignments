package methodoverriding;

import java.time.LocalDate;
import java.util.List;

// Parent class
class Movie {
    private String movieName;
    private String genre;
    private String director;
    private LocalDate releaseDate;
    private double rating;
    private int durationMinutes;
    private List<String> cast;

    public Movie(String movieName, String genre, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> cast) {
        this.movieName = movieName;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.durationMinutes = durationMinutes;
        this.cast = cast;
    }

    public void showDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("IMDB Rating: " + rating);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Cast: " + cast);
    }
}

// Romantic Comedy Movie
class RomanticMovie extends Movie {
    public RomanticMovie(String movieName, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> cast) {
        super(movieName, "Romantic Comedy", director, releaseDate, rating, durationMinutes, cast);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Special Feature: Tamil love and humor packed with emotion.");
    }
}

// Thriller Movie
class ThrillerMovie extends Movie {
    public ThrillerMovie(String movieName, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> cast) {
        super(movieName, "Thriller", director, releaseDate, rating, durationMinutes, cast);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Special Feature: Intense plot with suspense and action.");
    }
}

// Horror Movie
class HorrorMovie extends Movie {
    public HorrorMovie(String movieName, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> cast) {
        super(movieName, "Horror", director, releaseDate, rating, durationMinutes, cast);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Special Feature: Dark, spooky scenes and fear factor.");
    }
}

public class MovieMain {
    public static void main(String[] args) {
        Movie romantic = new RomanticMovie(
            "Oh My Kadavule",
            "Ashwath Marimuthu",
            LocalDate.of(2020, 2, 14),
            7.9,
            146,
            List.of("Ashok Selvan", "Ritika Singh")
        );

        Movie thriller = new ThrillerMovie(
            "Thadam",
            "Magizh Thirumeni",
            LocalDate.of(2019, 3, 1),
            8.1,
            138,
            List.of("Arun Vijay", "Tanya Hope")
        );

        Movie horror = new HorrorMovie(
            "Maya",
            "Ashwin Saravanan",
            LocalDate.of(2015, 8, 28),
            7.5,
            140,
            List.of("Nayanthara", "Aari")
        );

        Movie[] tamilMovies = { romantic, thriller, horror };

        for (Movie movie : tamilMovies) {
            movie.showDetails();
            System.out.println("---------------------------");
        }
    }
}
