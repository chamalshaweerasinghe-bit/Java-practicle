public class Main {

    public static void main(String[] args) {

        // Create objects
        LibraryBook b1 =
        new LibraryBook();

        LibraryBook b2 =
        new LibraryBook(101,
        "Java Programming",
        "James Gosling",
        5);

        // Print initial info
        System.out.println(
        b2.getBookInfo("A1"));

        System.out.println("----------------");

        // Borrow books
        System.out.println(
        b2.borrowBook(2));

        System.out.println("----------------");

        // Try borrowing more than available
        System.out.println(
        b2.borrowBook(5));

        System.out.println("----------------");

        // Return books
        b2.returnBook(1);

        System.out.println("----------------");

        // Borrow again
        System.out.println(
        b2.borrowBook(2));

        System.out.println("----------------");

        // Final info
        System.out.println(
        b2.getBookInfo("A1"));
    }
}