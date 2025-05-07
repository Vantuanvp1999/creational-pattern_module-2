public class BookBorrower {
    private BookSingleton borrowBooked;
    private boolean haveBook = false;
    public void borrowBook(){
        borrowBooked = BookSingleton.borrowBook();
        if(borrowBooked ==null){
            haveBook=false;
        }else{
            haveBook=true;
        }
    }
    public String getAuthorAndTitle(){
        if(haveBook){
            return borrowBooked.getAuthorAndTitle();
        }
        return "I dont have the book";
    }
    public void returnBook(){
        borrowBooked.returnBook(borrowBooked);
    }
}
