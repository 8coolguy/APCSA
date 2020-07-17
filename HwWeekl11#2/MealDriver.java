
/**
 * Write a description of class MealDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MealDriver
{
    public static void main(String[]args){
        
        //1.
        Meal meal1 =new Meal("Hamburger",5.25);
        //2.
        System.out.println(meal1.toString());
        //3.
        System.out.println("isHighCalory: " +meal1.isHighCalory());
        //4.
        Meal meal2 = new Meal("Burrito",8.55);
        //5.
        System.out.println(meal2.toString());
        //6.
        System.out.println("isHighCalory: " +meal2.isHighCalory());
        //7.
        deluxeMeal meal3 =new deluxeMeal("Hamburger",5.25,"Wings","Coke");
        //8.
        System.out.println(meal3.toString());
        //9.
        System.out.println("isHighCalory: " +meal3.isHighCalory());
        //10.
        deluxeMeal meal4 =new deluxeMeal("Chicken",7.49,"Wings","Coke");
        //11.
        System.out.println(meal4.toString());
        //12.
        System.out.println("isHighCalory: " +meal4.isHighCalory());
    }
}
