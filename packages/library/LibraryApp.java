package packages.library;

import packages.library.books.Book;
import packages.library.members.Member;
import packages.library.transactions.Transaction;

public class LibraryApp {
    public static void main(String[] args) {
        // Create book
        Book book = new Book("Wings of Fire", "A.P.J. Abdul Kalam");

        // Create member
        Member member = new Member("Anjali", "M102");

        // Display book and member info
        book.displayInfo();
        member.displayInfo();

        // Borrow transaction
        Transaction transaction = new Transaction(book, member, "2025-06-23");
        transaction.borrowBook();

        // Try borrowing again
        transaction.borrowBook();

        // Return transaction
        transaction.returnBook();

        // Borrow again
        transaction.borrowBook();
    }
}
