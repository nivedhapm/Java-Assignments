package abstractclassandmethods;

import java.util.ArrayList;
import java.util.Scanner;

public class DocumentView {
    private static ArrayList<Document> allDocuments = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Document Management System =====");
            System.out.println("1. Add PDF Document");
            System.out.println("2. Add Text Document");
            System.out.println("3. Add Image Document");
            System.out.println("4. View Documents");
            System.out.println("5. Open Document");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: addPDFDocument(); break;
                case 2: addTextDocument(); break;
                case 3: addImageDocument(); break;
                case 4: viewDocuments(); break;
                case 5: openDocument(); break;
                case 6:
                    System.out.println("Exiting... Thank you for using the Document Manager!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    private static void addPDFDocument() {
        System.out.print("Enter PDF File Name: ");
        String name = sc.next();
        System.out.print("Enter Author: ");
        String author = sc.next();
        System.out.print("Enter Number of Pages: ");
        int pages = sc.nextInt();

        allDocuments.add(new PDFDocument(name, author, pages));
        System.out.println("PDF Document added successfully!");
    }

    private static void addTextDocument() {
        System.out.print("Enter Text File Name: ");
        String name = sc.next();
        System.out.print("Enter Content: ");
        String content = sc.next();

        allDocuments.add(new TextDocument(name, content));
        System.out.println("Text Document added successfully!");
    }

    private static void addImageDocument() {
        System.out.print("Enter Image File Name: ");
        String name = sc.next();
        System.out.print("Enter Resolution (e.g., 1080p, 4K): ");
        String resolution = sc.next();

        allDocuments.add(new ImageDocument(name, resolution));
        System.out.println("Image Document added successfully!");
    }

    private static void viewDocuments() {
        if (allDocuments.isEmpty()) {
            System.out.println("\nNo documents found!");
            return;
        }

        System.out.println("\n===== Document Details =====");
        for (Document doc : allDocuments) {
            doc.displayInfo();
            System.out.println("Document Type: " + doc.getDocumentType());
            System.out.println("----------------------------");
        }
    }

    private static void openDocument() {
        if (allDocuments.isEmpty()) {
            System.out.println("\nNo documents available to open!");
            return;
        }

        System.out.print("\nEnter the index of the document to open (0 - " + (allDocuments.size() - 1) + "): ");
        int index = sc.nextInt();

        if (index < 0 || index >= allDocuments.size()) {
            System.out.println("Invalid index! Try again.");
            return;
        }

        allDocuments.get(index).open();
    }
}

// Abstract class
abstract class Document {
    protected String name;

    public Document(String name) {
        this.name = name;
    }

    public abstract void open();  
    public abstract String getDocumentType(); 

    public void displayInfo() { 
        System.out.println("Document Name: " + name);
    }
}

class PDFDocument extends Document {
    private String author;
    private int numberOfPages;

    public PDFDocument(String name, String author, int numberOfPages) {
        super(name);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + name + " | Author: " + author + " | Pages: " + numberOfPages);
    }

    @Override
    public String getDocumentType() {
        return "PDF Document";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author + " | Pages: " + numberOfPages);
    }
}

class TextDocument extends Document {
    private String content;

    public TextDocument(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + name + " | Content: " + content);
    }

    @Override
    public String getDocumentType() {
        return "Text Document";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Content Preview: " + content);
    }
}

class ImageDocument extends Document {
    private String resolution;

    public ImageDocument(String name, String resolution) {
        super(name);
        this.resolution = resolution;
    }

    @Override
    public void open() {
        System.out.println("Opening Image Document: " + name + " | Resolution: " + resolution);
    }

    @Override
    public String getDocumentType() {
        return "Image Document";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + resolution);
    }
}