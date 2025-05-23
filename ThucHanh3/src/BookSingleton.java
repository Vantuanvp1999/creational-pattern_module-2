public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton(){
        author = "Gamma, Helm, Johnson, and Vlissides";
        title  = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }
    public static BookSingleton borrowBook(){
        if(!isLoanedOut){
            if(book==null){
                book=new BookSingleton();
            }
            isLoanedOut=true;
                    return book;
        }
        return null;
    }
    public void returnBook(BookSingleton bookreturned){
        isLoanedOut=false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public String getAuthorAndTitle(){
        return getTitle()+ " by " +getAuthor();
    }
}
