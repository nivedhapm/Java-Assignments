package packages.library.transactions;
import packages.library.books.Book;
import packages.library.members.Member;

public class Transaction {
    private Book book;
    private Member member;
    private String date;

    public Transaction(Book book, Member member, String date) {
        this.book = book;
        this.member = member;
        this.date = date;
    }

    public void borrowBook() {
        if (book.isAvailable()) {
            book.borrow();
            System.out.println(member.getName() + " borrowed \"" + book.getTitle() + "\" on " + date);
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is not available.");
        }
    }

    public void returnBook() {
        book.returnBook();
        System.out.println(member.getName() + " returned \"" + book.getTitle() + "\" on " + date);
    }
}
