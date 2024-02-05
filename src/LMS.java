public class LMS {
    public static void main(String[] args) {
        System.out.println("Library Management System");
        Library library = new Library();
        library.addBook(new Book(101, "Meditation", "Marcus Aurelius"));
        library.addBook(new Book(102, "12 Rules for life", "Jordan Peterson"));
        library.addBook(new Book(103, "Build, Don't talk", "Raj Shomani"));
        library.addBook(new Book(104, "Don't shut up", "Prakhar Gupta"));

        library.showBooks();

        User user = new User(23, "Om Prakash Mallik");
        user.showOwnedBooks();

        user.ownBook(103);
        user.showOwnedBooks();
        user.ownBook(103);
        library.showBooks();
    }
}
