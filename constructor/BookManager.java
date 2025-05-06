package constructor;

import classesAndObjects.Book;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BookManager {
	private static int totalBooks;
	private static List<Book> books = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean flag = true;
		while(flag) {
			System.out.println("1. Add Book");
			System.out.println("2. Display All Books");
			System.out.println("3. Total Books");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice)
			{
			case 1:
				addBook();
				break;
				
			case 2:
				displayBooks();
				break;
			case 3:
				System.out.println(totalBooks);
				break;
				
			case 4: 
				flag = false;
				break;
				
			default:
				System.out.println("Incorrect choice!");
			}
		}	
	}
	
	public static void addBook(){
		System.out.println("Enter Book Title :" );
		String title = scan.nextLine();
		System.out.println("Enter Author Name : ");
		String author = scan.nextLine();
		System.out.println("Enter Book price : ");
		double price = scan.nextDouble();
		scan.nextLine();
		System.out.println("Enter ISBN Number : ");
		int isbn = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Published Year : ");
		int publishedYear = scan.nextInt();
		scan.nextLine();

		books.add(new Book(title, author, price, isbn, publishedYear));
		totalBooks++;
		System.out.println("Successfully Book added!");
	}
	
	public static void displayBooks() {
		if (books.isEmpty()) {
            System.out.println("No employees added yet.");
        } else {
            for (Book i : books) {
                System.out.println(i);
            }
        }
	}

}
