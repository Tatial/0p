public class Book {
    // Data fields
    private String name;
    private String author;
    private String publisher;

    // Constructor
    public Book(String name, String author, String publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    // Getter and Setter methods for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for 'author'
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter methods for 'publisher'
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Method to rent the book to a person
    public void rent(Person person) {
        System.out.println(person.getName() + " is renting the book: " + name);
    }

    // Method to display book information on one line
    public void toDisplay() {
        System.out.println("Book: " + name + ", Author: " + author + ", Publisher: " + publisher);
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("Jane Doe", 28, "jane.doe@example.com", "987-654-3210");

        // Create a new Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons");

        // Display book information
        book.toDisplay();

        // Rent the book to the person
        book.rent(person);
    }
}
