public class bookApp {

    public static void main(String[] args) {

        book book1 = new book();

        book1.setTitle("Madol Duwa");
        book1.setAuthor("Martin Wickramasinghe");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
    }
}