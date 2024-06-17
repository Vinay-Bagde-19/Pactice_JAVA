public class Book {
    static int totalBooks;

    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already borrowed.");
        }else{
            System.out.println("Enjoy " + this.title);
            this.isBorrowed = true;
        }
    }

    void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
            System.out.println("Hope you enjoyed , Please leave a review.");
        }else{
            System.out.println("This book is already in the Library.");
        }
    }

    Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }


    public static void main(String[] args) {
        Book myBook1 = new Book("101", "Java", "James Gosling");
        Book myBook2 = new Book("1003");
        System.out.println(Book.getTotalBooks());
        myBook1.borrowBook();
        myBook2.borrowBook();
        myBook1.borrowBook();
        myBook1.returnBook();
        myBook1.returnBook();
    }
}
