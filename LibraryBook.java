public class LibraryBook {

    int bookId;
    String title;
    String author;
    int totalCopies;
    int borrowedCopies;

    // Non-parameterized constructor
    public LibraryBook() {

        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        totalCopies = 0;
        borrowedCopies = 0;
    }

    // Parameterized constructor
    public LibraryBook(int bookId,
                       String title,
                       String author,
                       int totalCopies) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;

        borrowedCopies = 0;
    }

    // Borrow book method
    public String borrowBook(int count) {

        int available;

        available = totalCopies - borrowedCopies;

        if (count <= available) {

            borrowedCopies = borrowedCopies + count;

            available = totalCopies - borrowedCopies;

            return "Successfully borrowed " +
                   count +
                   " copy/copies. Remaining: " +
                   available;
        }

        else {

            return "Only " + available +
                   " copy/copies available.";
        }
    }

    // Return book method
    public void returnBook(int count) {

        if (count <= borrowedCopies) {

            borrowedCopies = borrowedCopies - count;

            System.out.println(count +
            " copy/copies returned successfully.");
        }

        else {

            System.out.println(
            "Return count exceeds borrowed copies.");
        }
    }

    // Get available copies method
    public int getAvailableCopies() {

        return totalCopies - borrowedCopies;
    }

    // Get book info method
    public String getBookInfo(String shelf) {

        return "Book ID: " + bookId +
               "\nTitle: " + title +
               "\nAuthor: " + author +
               "\nTotal Copies: " + totalCopies +
               "\nBorrowed Copies: " + borrowedCopies +
               "\nShelf: " + shelf;
    }
}