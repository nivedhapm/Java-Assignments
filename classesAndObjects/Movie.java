package classesAndObjects;

public class Movie {
	private String name;
	private String genre;
	private String director;
	private String duration;
	public static final String language = "Tamil";
	private String hero;
	private String heroine;
	private double rating;
	
	public Movie(String name, String genre, String director, String duration, String hero, String heroine,
			double rating) {
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.duration = duration;
		this.hero = hero;
		this.heroine = heroine;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MOVIE DETAILS:  \n\nName: " + name + "\nGenre: " + genre + "\nDirector: " + director + "\nDuration: " + duration
				+"\nLanguage: " +language+"\nHero: " + hero + "\nHeroine: " + heroine + "\nRating: " + rating;
	}
	
}
