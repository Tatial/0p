import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input Person details
        System.out.println("Enter Person details:");
        System.out.print("Name: ");
        String personName = scanner.nextLine();

        System.out.print("Age: ");
        int personAge = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left-over

        System.out.print("Email: ");
        String personEmail = scanner.nextLine();

        System.out.print("Phone: ");
        String personPhone = scanner.nextLine();

        // 2. Input Book details
        System.out.println("\nEnter Book details:");
        System.out.print("Book Name: ");
        String bookName = scanner.nextLine();

        System.out.print("Author: ");
        String bookAuthor = scanner.nextLine();

        System.out.print("Publisher: ");
        String bookPublisher = scanner.nextLine();

        // 3. Create Book and Person objects
        Book book = new Book(bookName, bookAuthor, bookPublisher);
        Person person = new Person(personName, personAge, personEmail, personPhone);

        // 4. Call the toDisplay method for each
        System.out.println("\nDisplaying Person and Book information:");
        person.toDisplay();  // Display Person info
        book.toDisplay();    // Display Book info

        // 5. Call the rent method for the Book class object
        System.out.println("\nRenting the book...");
        book.rent(person);  // Person rents the book

        // 6. Set favoriteBook for the Person
        System.out.println("\nSetting favorite book for the person...");
        person.setFavoriteBook(book);  // Set favorite book
        person.toDisplay();  // Display Person info again with favorite book

        scanner.close();  // Close the scanner
    }
}
