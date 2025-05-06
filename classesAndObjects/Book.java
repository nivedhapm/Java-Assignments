package classesAndObjects;

public class Book {

	private String bookTitle;
	private String authorName;
	private double price;
	private int isbn;
	private int publishedYear;
	public static int bookCount;

	public Book(String title, String author, double price, int isbn, int publishedYear){
		this.bookTitle = title;
		this.authorName = author;
		this.price = price;
		this.isbn = isbn;
		this.publishedYear = publishedYear;
		bookCount++;
	}
	public void setTitle(String title) {
		this.bookTitle = title;
	}
	public String getTitle() {
		return bookTitle;
	}
	public void setAuthor(String author) {
		this.authorName = author;
	}
	public String getAuthor() {
		return authorName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	
	@Override
	public String toString() {
		return "BOOK DETAILS \n\nTitle: " + bookTitle + "\nAuthor: " + authorName + "\nPrice: " + price + "\nISBN: " + isbn
				+ "\nPublished Year: " + publishedYear;
	}
}
