class Encapsulation {
    private String name;
    private String email;
    private char gender;

    // Constructor
    public Encapsulation(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
}

class Book {
    private String name;
    private Encapsulation author; // Encapsulation object as Author
    private double price;
    private int qtyInStock;

    // Constructor
    public Book(String name, Encapsulation author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Encapsulation getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Encapsulation author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

class Main {
    public static void main(String[] args) {
        // Create Author
        Encapsulation author = new Encapsulation("Roy", "roy@gmail.com", 'M');

        // Create Book
        Book b = new Book("Java", author, 100.0, 10);

        // Print details
        System.out.println("Book Name: " + b.getName());
        System.out.println("Author Name: " + b.getAuthor().getName());
        System.out.println("Author Email: " + b.getAuthor().getEmail());
        System.out.println("Author Gender: " + b.getAuthor().getGender());
        System.out.println("Price: " + b.getPrice());
        System.out.println("Stock: " + b.getQtyInStock());
    }
}
