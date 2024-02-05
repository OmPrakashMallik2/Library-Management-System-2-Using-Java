public class Book {
    private int bookId;
    private String bookTitle;
    private String authorName;
    private boolean availability;

    public Book(int bookId, String bookTitle, String authorName) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        availability = true;
    }

    public int getBookId() {
        return bookId;
    }
    public void setAvailability(boolean available) {
        availability = available;
    }
    public  boolean  getAvailability() {
        return availability;
    }




    public String bookDetails() {
        return "Book [" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", isAvailable=" + availability +
                ']';
    }
}
