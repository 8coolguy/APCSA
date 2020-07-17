import java.util.ArrayList;

public class main{
    
    public static void main(String[]args){
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        
        Book book1 = new Book("Frankenstain","Mary Shelly");
        Book book2 = new PictureBook("Wizard of Oz","L. frank Baum","WW Denslow");


        myLibrary.add(book1);
        myLibrary.add(book2);
        
        BookListing frank =new BookListing(book1,(Math.random() * ((5) + 1)) + 15); 
        BookListing oz =new BookListing(book2,(Math.random() * ((5) + 1)) + 15);
         
        frank.printDescription();
        oz.printDescription();
        
        
        
        
    }
}