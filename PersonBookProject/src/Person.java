public class Person {
    // Data fields
    private String name;
    private int age;
    private String email;
    private String phone;

    // Composition: Person has a favoriteBook (Book class object)
    private Book favoriteBook;

    // Constructor
    public Person(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    // Getter and Setter methods for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter methods for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter methods for 'phone'
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter and Setter methods for 'favoriteBook'
    public Book getFavoriteBook() {
        return favoriteBook;
    }

    public void setFavoriteBook(Book favoriteBook) {
        this.favoriteBook = favoriteBook;
    }

    // Method to display person and favorite book information on one line
    public void toDisplay() {
        System.out.print("Name: " + name + ", Age: " + age + ", Email: " + email + ", Phone: " + phone);
        if (favoriteBook != null) {
            System.out.print(", Favorite Book: ");
            favoriteBook.toDisplay();
        } else {
            System.out.println(", No favorite book set.");
        }
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Create a new Book object
        Book book = new Book("1984", "George Orwell", "Secker & Warburg");

        // Create a new Person object
        Person person = new Person("John Doe", 35, "john.doe@example.com", "123-456-7890");

        // Set favoriteBook for the person
        person.setFavoriteBook(book);

        // Display the person's information along with their favorite book
        person.toDisplay();
    }
}
