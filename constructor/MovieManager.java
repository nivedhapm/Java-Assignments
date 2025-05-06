package constructor;

import classesAndObjects.Movie;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MovieManager {
    private static List<Movie> movies = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("\n1. Add Movie");
            System.out.println("2. Display All Movies");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    displayMovies();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect choice!");
            }
        }
    }

    public static void addMovie() {
        System.out.print("Enter Movie Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Genre: ");
        String genre = scan.nextLine();

        System.out.print("Enter Director Name: ");
        String director = scan.nextLine();

        System.out.print("Enter Duration (eg: 2h 30m): ");
        String duration = scan.nextLine();

        System.out.print("Enter Hero Name: ");
        String hero = scan.nextLine();

        System.out.print("Enter Heroine Name: ");
        String heroine = scan.nextLine();

        System.out.print("Enter Rating (out of 10): ");
        double rating = scan.nextDouble();
        scan.nextLine(); 

        Movie newMovie = new Movie(name, genre, director, duration, hero, heroine, rating);
        movies.add(newMovie);
        System.out.println("Movie added successfully!");
    }

    public static void displayMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies added yet.");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }
}
