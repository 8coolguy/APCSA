
/**
 * Write a description of class Validate here.
 *
 * Arnav Choudhury
 * 10/14
 */
public class Validate
{
   public int x=0;
   public String[] alpha={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
   public String[] returns={"length is greater than 13","length is less than 13","area code 800 and above","where the () at?","is this even a number","where is the dash"};
public Validate(String y){
if(y.length()>13){
       x=0;
       faLse();
       
   }
else if(y.length()<13){
       x=1;
       faLse();
       
   }   
else if(Integer.parseInt(y.substring(1,4))>799){
       x=2;
       faLse();
       
   }
else if(y.lastIndexOf("-")!=8){
        x=5;
        faLse();
    }
else if(y.lastIndexOf("(")!=0||y.lastIndexOf(")")!=4){
       x=3;
       faLse();
       
   }
else if(alphabet(y)){
       x=4;
       faLse();
       
   }
   else System.out.println("Success");
}    
   private void faLse(){
   System.out.print("Fail");
   System.out.println(" "+returns[x]);
   }
   
   
   
   
   public Boolean alphabet(String y){
       for(int i=0;i<25;i++)
           if(y.lastIndexOf(alpha[i]) >0){
               return true; 
               }
       return false;
   }


}


