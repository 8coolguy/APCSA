
/**
 * Write a description of class Student here.
 *
 * @Arnav Choudhury
 * @10/22
 */
public class Student
{
int saT=0;
String name;
double gpa;
static int count;
double max=0;
double min=5.0;
    public Student(String x,int y,double z){
        setName(x);
        setSAT(y);
        setGPA(z);
    
        count++;
    
    
    
    
    
    
    
    
    }
    private void setGPA(double x){
        if(x<0.0)
            x=3.0;
        else if(x>5.0)
            x=3.0;
        this.gpa=x;    
    }
    private void setSAT(int x){
        if(x >1600)
            x=1000;
        else if(x<400)
            x=1000;
        this.saT=x;
        
    }
    private void setName(String x){
        this.name=x;
        
    }
    private void setCount(int x){
        this.count=x;    
    }
    public String getName(){
        return name;
    }
    public double getGPA(){
        return gpa;    
    }
    public int getSat(){
        return saT;    
    }
    public static int getCount(){
        return count;
    }
    public int reverseDigits(){
        int reverse=0;
        while(saT != 0) {
            int num = saT % 10;
            reverse = reverse*10+num;
             saT/= 10;
            
        
    }
    return reverse;
    }
    public static String studentStatus(int x,double y){
        String status[] ={"excellent","very good","good","solid","promising"};
        int w=0;
        if(y>4.00 && x>1400)
            w=0;   
        else if(y>4.00 && x<1400)
            w=1;   
        else if(y>4.00 && x<1000)
            w=2;   
        else if(y<4.00 && x>1400)
            w=1;
        else if(y<4.00 && x<1400)
            w=2;
        else if(y<4.00 && x<1000)
            w=3;
        else if(y<3.00 && x<1000)
            w=4;
        return status[w];
    }


}
