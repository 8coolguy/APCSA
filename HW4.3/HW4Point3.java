
/**
 * Write a description of class StudentDriver here.
 *
 * @Arnav Choudhury
 * @10/22
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class HW4Point3
{
    public static void main(String args[]) {
        
        String entry;
        int sat;
        double gpa;
        double max=0;
        double min=5.0;
        double totalsumGPA=0.0;
        try {
            File file = new File("students.txt");

            Scanner input = new Scanner(file);
            
            System.out.println("");
            while (input.hasNextLine())
            {
               entry = input.nextLine();
               sat = Integer.parseInt(input.nextLine());
               gpa = Double.parseDouble(input.nextLine());
               
               System.out.println(entry + " " + sat + " " + gpa);
               
               Student x =new Student(entry,sat,gpa);
               
               if (max<x.getGPA())
                   max =x.getGPA();
               if (min>x.getGPA())
                   min =x.getGPA();
               System.out.println(x.getName() + " " + x.getSat() + " " + x.getGPA());
               System.out.println(x.reverseDigits());
               System.out.println(Student.studentStatus(x.getSat(),x.getGPA()));
               
               totalsumGPA= totalsumGPA +x.getGPA();
               
               
               
            }
            System.out.println(max);
            System.out.println(min);
            System.out.println(totalsumGPA/Student.getCount());
            
            
            
            input.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not Found.");
        }
        catch (Exception e) {
            System.out.println("Error: Something unexpected occured.");
        }
    
    }
}



