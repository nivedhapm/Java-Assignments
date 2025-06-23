package abstractclassandmethods;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartView {
    private static ArrayList<Product> cart = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Shopping Cart =====");
            System.out.println("1. Add Electronics Product");
            System.out.println("2. Add Clothing Product");
            System.out.println("3. Add Book Product");
            System.out.println("4. View Cart");
            System.out.println("5. Calculate Total Price");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addElectronicsProduct();
                    break;
                case 2:
                    addClothingProduct();
                    break;
                case 3:
                    addBookProduct();
                    break;
                case 4:
                    viewCart();
                    break;
                case 5:
                    calculateTotalPrice();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you for shopping!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    private static void addElectronicsProduct() {
        System.out.println("\nEnter details for Electronics Product:");
        System.out.print("Product Name: ");
        String name = sc.next();
        System.out.print("Brand: ");
        String brand = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Warranty (in years): ");
        int warranty = sc.nextInt();

        Product product = new ElectronicsProduct(name, price, brand, warranty);
        cart.add(product);
        System.out.println("Electronics Product added to cart!");
    }

    private static void addClothingProduct() {
        System.out.println("\nEnter details for Clothing Product:");
        System.out.print("Product Name: ");
        String name = sc.next();
        System.out.print("Size (S/M/L/XL): ");
        String size = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Material: ");
        String material = sc.next();

        Product product = new ClothingProduct(name, price, size, material);
        cart.add(product);
        System.out.println("Clothing Product added to cart!");
    }

    private static void addBookProduct() {
        System.out.println("\nEnter details for Book Product:");
        System.out.print("Title: ");
        String title = sc.next();
        System.out.print("Author: ");
        String author = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Pages: ");
        int pages = sc.nextInt();

        Product product = new BookProduct(title, price, author, pages);
        cart.add(product);
        System.out.println("Book Product added to cart!");
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty!");
            return;
        }

        System.out.println("\n===== Cart Details =====");
        for (Product product : cart) {
            System.out.println(product.getDescription());
            System.out.println("------------------------");
        }
    }

    private static void calculateTotalPrice() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        System.out.println("\nTotal Price of Cart: ₹" + total);
    }
}

abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getDescription();
}

class ElectronicsProduct extends Product {
    private String brand;
    private int warrantyYears;

    public ElectronicsProduct(String name, double price, String brand, int warrantyYears) {
        super(name, price);
        this.brand = brand;
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name + " | Brand: " + brand + " | Warranty: " + warrantyYears + " years | Price: ₹" + price;
    }
}

class ClothingProduct extends Product {
    private String size;
    private String material;

    public ClothingProduct(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + name + " | Size: " + size + " | Material: " + material + " | Price: ₹" + price;
    }
}

class BookProduct extends Product {
    private String author;
    private int pages;

    public BookProduct(String name, double price, String author, int pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getDescription() {
        return "Book: " + name + " | Author: " + author + " | Pages: " + pages + " | Price: ₹" + price;
    }
}