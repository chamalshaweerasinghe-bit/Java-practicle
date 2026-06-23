public class book {

    private String title;
    private String author;


    public void setTitle(String title) {

        if (!title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be null");
        }
    }

    public String getTitle() {
        return title;
    }

   
    public void setAuthor(String author) {

        if (!author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Author cannot be null");
        }
    }

    
    public String getAuthor() {
        return author;
    }
        public static void main(String[] args) {

        book b1 = new book();

        b1.setTitle("Madol Duwa");
        b1.setAuthor("Martin Wickramasinghe");

        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
    }
}