import java.util.ArrayList;

public class User {
    private int userId;
    private String username;
    private ArrayList<Book> booksOwned;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
        booksOwned = new ArrayList<>();
        System.out.println("User enrolled");
    }

    public void ownBook(int bookId){
        ArrayList<Book> books = Library.getBooks();
        for (Book book: books){
            if (book.getBookId() == bookId){
                if (book.getAvailability()){
                    booksOwned.add(book);
                    book.setAvailability(false);
                } else{
                    System.out.println("Book is not available");
                }
            }
        }
    }

    public void showOwnedBooks(){
        if (booksOwned.isEmpty()){
            System.out.println("Didn't owned any books");
            return;
        }
        for (Book book: booksOwned){
            System.out.println(book.bookDetails());
        }
    }
}
