package inheritance;
import java.util.*;

public class LibraryMangementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Wings of Fire", "A.P.J.Abdul Kalam", "12345");
        library.addBook("Motivating Thoughts of Kalam", "A.P.J.Abdul Kalam", "67890");

        library.registerMember("Alice");
        library.registerMember("Bob");

        library.issueBook(1, "12345"); 
        library.issueBook(2, "67890"); 

        library.displayBooks();
        library.displayTransactions();

        library.returnBook(1, "12345");

        library.displayTransactions();
    }
}

class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isIssued;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isIssued = false;
    }

    public String getISBN() { return ISBN; }
    public String getTitle() { return title; }
    public boolean isIssued() { return isIssued; }
    public void issueBook() { isIssued = true; }
    public void returnBook() { isIssued = false; }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + ISBN + ") " + (isIssued ? "[Issued]" : "[Available]");
    }
}

class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name;
    }
}

class Transaction {
    private Member member;
    private Book book;
    private Date issueDate;
    private Date returnDate;

    public Transaction(Member member, Book book) {
        this.setMember(member);
        this.setBook(book);
        this.issueDate = new Date();
        this.returnDate = null;
    }

    public void returnBook() {
        this.returnDate = new Date();
        getBook().returnBook();
    }

    public boolean isActive() {
        return returnDate == null;
    }

    @Override
    public String toString() {
        return "Transaction: " + getMember().getName() + " borrowed " + getBook().getTitle() +
               " on " + issueDate + (returnDate == null ? " [Not Returned]" : " and returned on " + returnDate);
    }

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
}

class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Transaction> transactions;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addBook(String title, String author, String ISBN) {
        books.add(new Book(title, author, ISBN));
        System.out.println("Book added: " + title);
    }

    public void registerMember(String name) {
        int newId = members.size() + 1;
        members.add(new Member(name, newId));
        System.out.println("Member registered: " + name + " (ID: " + newId + ")");
    }

    public void issueBook(int memberId, String ISBN) {
        Member member = findMemberById(memberId);
        Book book = findBookByISBN(ISBN);

        if (member == null || book == null || book.isIssued()) {
            System.out.println("Cannot issue book.");
            return;
        }

        book.issueBook();
        Transaction transaction = new Transaction(member, book);
        transactions.add(transaction);
        System.out.println("Book issued: " + book.getTitle() + " to " + member.getName());
    }

    public void returnBook(int memberId, String ISBN) {
        for (Transaction t : transactions) {
            if (t.isActive() && t.getBook().getISBN().equals(ISBN) && t.getMember().getMemberId() == memberId) {
                t.returnBook();
                System.out.println("Book returned: " + t.getBook().getTitle() + " by " + t.getMember().getName());
                return;
            }
        }
        System.out.println("No active transaction found.");
    }

    private Member findMemberById(int memberId) {
        for (Member m : members) {
            if (m.getMemberId() == memberId) return m;
        }
        return null;
    }

    private Book findBookByISBN(String ISBN) {
        for (Book b : books) {
            if (b.getISBN().equals(ISBN)) return b;
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void displayTransactions() {
        System.out.println("\nTransaction History:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
