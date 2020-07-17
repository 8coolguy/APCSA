





import java.util.Scanner;
import java.util.Random;

public class Reader
{
    int i =1;
   public static void drawBoard(char[] board)    {
        System.out.println();
        System.out.println("  " + board[0]+"|"+board[1]+"|"+board[2]);
        System.out.println("  -----");        
        System.out.println("  " + board[3]+"|"+board[4]+"|"+board[5]);
        System.out.println("  -----");        
        System.out.println("  " + board[6]+"|"+board[7]+"|"+board[8]);
   }
   

   

   public void placeMark(int z,Reader x,char[] y){
       if (y[z] ==' '){
           y[z]=Reader.getOutput(x.getI());
           i++;
       }
       else{ 
           System.out.println("Choose a unfilled Spot"); 
           
        }
       
   }
   public static char getOutput(int i){
   if(i%2==0)
       return'O';
   else if(i%2==1)
       return'X';
   return'E';  
   }
   public static boolean winCondition(char[] board){
   if(((board[0]=='X'||board[0]=='O')&& board[0]==board[1] && board[1]==board[2])||((board[3]=='X'||board[3]=='O')&&(board[3]==board[4] && board[4]==board[5]))||((board[6]=='X'||board[6]=='O')&&(board[6]==board[7] && board[7]==board[8]))){ 
       return true;//checks for each row
       }
   if(((board[0]=='X'||board[0]=='O')&& board[0]==board[3] && board[3]==board[6])||((board[1]=='X'||board[1]=='O')&&(board[1]==board[4] && board[4]==board[7]))||((board[2]=='X'||board[2]=='O')&&(board[2]==board[5] && board[5]==board[8])))
       return true;//checks for each collumn
   if(((board[0]=='X'||board[0]=='O')&& board[0]==board[4] && board[4]==board[8])||((board[2]=='X'||board[2]=='O')&&(board[2]==board[4] && board[4]==board[6])))
      return true;//checks cross
   return false;
   }
   public static boolean isNotFilled(char[] y){
       for(int i =0;i<y.length-1;i++){
           if(y[i]==' ')
               return true;
       }
       return false;
    }
   public void setI(int x){
   this.i=x;    
   }
   public int getI(){
       return i;    
   }
   public static int machine1(char[] board,Reader z){
       if(z.getI()==1)
           return new Random().nextInt(10);
       else if (z.getI()==3){
           return new Random().nextInt(10);
       
        }
       return new Random().nextInt(10);   
       
   }
   public static int machine2(char[] board){
       return new Random().nextInt(10);    
       
   }
   public static void main(String [ ] args) {
       Scanner x = new Scanner(System.in);
       char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
       Reader z = new Reader();
       System.out.println("Would like to play man or machine(m or a)");
       String a =x.nextLine();
       if(a.equals("m")){
           while(Reader.isNotFilled(board)){
               System.out.println("Place your "+ Reader.getOutput(z.getI())+ " using keys 1-9");
               int y= x.nextInt()-1;  
               z.placeMark(y,z,board);
               System.out.println("Turn# "+z.getI());
               drawBoard(board);
               if(Reader.winCondition(board)){
                   break;    
               }
               
               
           }
        }
       else if(a.equals("a")){
           System.out.println("1 or 2");
           int w=x.nextInt();
           if(w==2){
               while(Reader.isNotFilled(board)){
               
                   System.out.println("Place your "+Reader.getOutput(z.getI())+ " using keys 1-9");
                   if(z.getI()%2==1){
                       z.placeMark(Reader.machine1(board,z),z,board);
                       System.out.println("Turn# "+z.getI());
                       drawBoard(board);
                    }
                    else if(z.getI()%2==0){
                        int y= x.nextInt()-1;
                        z.placeMark(y,z,board);
                        System.out.println("Turn# "+z.getI());
                        drawBoard(board);
                    }
               
               
                    if(Reader.winCondition(board)){
                       break;    
                    }  
                }
           }
           if(w==1){
               while(Reader.isNotFilled(board)){
               
                   System.out.println("Place your "+Reader.getOutput(z.getI())+ " using keys 1-9");
                   if(z.getI()%2==0){
                       z.placeMark(Reader.machine2(board),z,board);
                       System.out.println("Turn# "+z.getI());
                       drawBoard(board);
                    }
                    else if(z.getI()%2==1){
                        int y= x.nextInt()-1;
                        z.placeMark(y,z,board);
                        System.out.println("Turn# "+z.getI());
                        drawBoard(board);
                    }
               
               
                    if(Reader.winCondition(board)){
                       break;    
                    }  
                }
           }
       }
           
           
           
           
           
           
           
       if(Reader.winCondition(board)){
           if(z.getI()%2==1)
               System.out.println("Player 2 WINS");
           else if(z.getI()%2==0)
               System.out.println("Player 1 WINS");
       }
       else System.out.println("Tie");

   }
}