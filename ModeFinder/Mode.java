import java.util.Arrays;
import java.util.Collections;

public class Mode
{
  // Prerequisite.  There will only be one mode in the array.
  
  public static void main(String[] args)
  {
      int[] nums={20,15,20,17,17,14,11,8,8,6,5,19,19,20,5,32,21,32,32,32,323,};
      
      Arrays.sort(nums);// 1. Search the web for a Java method that sorts an array.
      // Sort the array nums.
      int x=nums[0];
      int modeCount=0;
      int numsCount=0;
      int oldNum=nums[0];
      for(int i=0;i<nums.length-1;i++){
          if(nums[i]==oldNum)
               numsCount++;
          else{
              if(numsCount>modeCount){
                   modeCount=numsCount;
                   x=oldNum;
                }
                numsCount=1;
                oldNum=nums[i];
          }            
      if (numsCount>modeCount) 
           x=oldNum;
        }   
          
          
      
      System.out.println(x);// 2. Use a for each loop to determine the "mode" of the sorted 
      //    array nums.   The mode is the number that occurs the most
      //    times in a list.   Print the mode.
  }
}