import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void showBooks(){
        for (Book book : books) {
            System.out.println(book.bookDetails());
        }
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }
}
