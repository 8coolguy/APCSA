
public class BookListing
{
   Book book;
   double price;
   public BookListing(Book inBook,double inPrice){
    book =inBook;
    price =inPrice;
       
    }
   public void printDescription(){
     book.printBookInfo();
     System.out.println(" $ "+price);
       
    }
}
