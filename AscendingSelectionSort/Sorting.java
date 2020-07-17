import java. util.*;

public class Sorting
{
  public static void main(String[] args)
  {
      ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(7,4,2,6));
      ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(1,3,6,8));
      ArrayList<Integer> a3 = new ArrayList<Integer>(Arrays.asList(5, 3));
      ArrayList<Integer> a4 = new ArrayList<Integer>(Arrays.asList(8));
      ArrayList<Integer> a5 = new ArrayList<Integer>(Arrays.asList());
      ArrayList<Integer> a6 = new ArrayList<Integer>(Arrays.asList(7,4,2,6));
      ArrayList<Integer> a7 = new ArrayList<Integer>(Arrays.asList(1,3,6,8));
      ArrayList<Integer> a8 = new ArrayList<Integer>(Arrays.asList(5, 3));
      ArrayList<Integer> a9 = new ArrayList<Integer>(Arrays.asList(8));
      ArrayList<Integer> a10 = new ArrayList<Integer>(Arrays.asList());aa

        
      ArrayList[] arr1 = {a1, a2, a3, a4, a5};
      ArrayList[] arr2 = {a6, a7, a8, a9, a10};
      
      System.out.println();
      System.out.println("The Original ArrayLists:");
      for (ArrayList<Integer> alist:arr1)   
        System.out.println(alist);
        
      // Problem #1.   Create a void method that takes an ArrayList
      // as a formal parameter and uses a selection sort 
      // to sort the ArrayList in ascending order.   
      // Sort and print all ArrayLists in arr1.     
      System.out.println();
      System.out.println("The ArrayLists after selection sort:");
      for (ArrayList<Integer> alist:arr1)    {
        // Here is where you invoke the selection sort method.
        System.out.println(alist);
      }

      // Problem #2.   Create a void method that takes an ArrayList
      // as a formal parameter and uses a insertion sort 
      // to sort the ArrayList in ascending order.   
      // Sort and print all ArrayLists in arr1.     
      System.out.println();
      System.out.println("The ArrayLists after insertion sort:");
      for (ArrayList<Integer> alist:arr2)    {
          =
          // Here is where you invoke the insertion sort method.
          System.out.println((alist));
        }
  }
}