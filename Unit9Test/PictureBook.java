

public class PictureBook extends Book
{
    String illustrator;
    public PictureBook(String title,String author, String inIllustrator){
        super(title,author);
        illustrator =inIllustrator;
        
    }
    public void printBookInfo(){
        super.printBookInfo();
        System.out.print("drawn by "+illustrator);
        
    }
}
