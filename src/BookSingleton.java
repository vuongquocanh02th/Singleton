public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton bookSingleton;
    private static boolean isLoanedOut;

    private BookSingleton() {
        author = "John, Smith";
        title = "Warpath";
        bookSingleton = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (bookSingleton == null) {
                bookSingleton = new BookSingleton();
            }
            isLoanedOut = true;
            return bookSingleton;
        }
        return null;
    }

    public void returnBook(BookSingleton bookReturned) {
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }

}
