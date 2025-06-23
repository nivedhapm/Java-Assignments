package abstractclassandmethods;
import java.util.ArrayList;
import java.util.Scanner;

public class MoviesView {
    private static ArrayList<Movie> movies = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Movie Management System =====");
            System.out.println("1. Add Romantic Comedy Movie");
            System.out.println("2. Add Thriller Movie");
            System.out.println("3. Add Horror Movie");
            System.out.println("4. View Movies");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: addRomComMovie(); break;
                case 2: addThrillerMovie(); break;
                case 3: addHorrorMovie(); break;
                case 4: viewMovies(); break;
                case 5:
                    System.out.println("Exiting... Thank you for using the Movie Manager!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    private static void addRomComMovie() {
        System.out.print("Enter Romantic Comedy Movie Title: ");
        String title = sc.next();
        System.out.print("Director: ");
        String director = sc.next();
        System.out.print("Duration (minutes): ");
        int duration = sc.nextInt();
        System.out.print("Lead Couple: ");
        String leadCouple = sc.next();

        movies.add(new RomComMovie(title, duration, director, leadCouple));
        System.out.println("Romantic Comedy Movie added successfully!");
    }

    private static void addThrillerMovie() {
        System.out.print("Enter Thriller Movie Title: ");
        String title = sc.next();
        System.out.print("Director: ");
        String director = sc.next();
        System.out.print("Duration (minutes): ");
        int duration = sc.nextInt();
        System.out.print("Suspense Level (1-10): ");
        int suspenseLevel = sc.nextInt();

        movies.add(new ThrillerMovie(title, duration, director, suspenseLevel));
        System.out.println("Thriller Movie added successfully!");
    }

    private static void addHorrorMovie() {
        System.out.print("Enter Horror Movie Title: ");
        String title = sc.next();
        System.out.print("Director: ");
        String director = sc.next();
        System.out.print("Duration (minutes): ");
        int duration = sc.nextInt();
        System.out.print("Scare Factor (1-10): ");
        int scareFactor = sc.nextInt();

        movies.add(new HorrorMovie(title, duration, director, scareFactor));
        System.out.println("Horror Movie added successfully!");
    }

    private static void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("\nNo movies found!");
            return;
        }

        System.out.println("\n===== Movie Details =====");
        for (Movie movie : movies) {
            System.out.println(movie.getMovieDetails());
            System.out.println("Movie Category: " + movie.getMovieCategory());
            System.out.println("-------------------------");
        }
    }
}

// Abstract Movie class
abstract class Movie {
    protected String title;
    protected int duration;
    protected String director;

    public Movie(String title, int duration, String director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public abstract String getMovieCategory();

    public abstract String getMovieDetails();
}

class RomComMovie extends Movie {
    private String leadCouple;

    public RomComMovie(String title, int duration, String director, String leadCouple) {
        super(title, duration, director);
        this.leadCouple = leadCouple;
    }

    @Override
    public String getMovieCategory() {
        return "Romantic Comedy";
    }

    @Override
    public String getMovieDetails() {
        return "Romantic Comedy Movie: " + title + " | Director: " + director + " | Lead Couple: " + leadCouple + " | Duration: " + duration + " mins";
    }
}

class ThrillerMovie extends Movie {
    private int suspenseLevel;

    public ThrillerMovie(String title, int duration, String director, int suspenseLevel) {
        super(title, duration, director);
        this.suspenseLevel = suspenseLevel;
    }

    @Override
    public String getMovieCategory() {
        return "Thriller";
    }

    @Override
    public String getMovieDetails() {
        return "Thriller Movie: " + title + " | Director: " + director + " | Suspense Level: " + suspenseLevel + " | Duration: " + duration + " mins";
    }
}

class HorrorMovie extends Movie {
    private int scareFactor;

    public HorrorMovie(String title, int duration, String director, int scareFactor) {
        super(title, duration, director);
        this.scareFactor = scareFactor;
    }

    @Override
    public String getMovieCategory() {
        return "Horror";
    }

    @Override
    public String getMovieDetails() {
        return "Horror Movie: " + title + " | Director: " + director + " | Scare Factor: " + scareFactor + " | Duration: " + duration + " mins";
    }
}