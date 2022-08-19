import java.util.*;
import java.lang.*;

class ArrayPowerSum {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    
      System.out.println("Enter one of four numbers to put into the array to be summed: ");
      
    
    
    
    int myArrayExample2 = {num1, num2, num3, num4};
    int exampleSum = sumOfIntArray(myArrayExample2);
    System.out.printf("Question #1 asked for a program that can sum all the values in a given array. 
                       So running the four array elements you entered through my method for this
                       question, the result is %d.\n\n\n\n", exampleSum);
    
    
    
    
    System.out.print("This is the result of question #2 after I fixed typos on lines 18 and 22 from original code: ");
    
    //2. Output of below code would be 2, if the code didn't originally have typos on line 18 and 22. But once I fixed those, the output was 2.
    double[ ] exampleArray = {1,5,6,5,4,1};
          double maximum = exampleArray[0];
          int index = 0;
          for (int i = 1; i < exampleArray.length; i++){
               if (exampleArray[ i ] > maximum) {
                    maximum = exampleArray[ i ];
                    index = i;
               }
          }
    
          System.out.println(index);
    
                      
                      
         System.out.printf("Question #3 requires 2 integers, ", );
                      
                      
          
  }//end of main method
  
  
  
  
  //1. Write a program to sum all the values of a given Array in Java.
      public static int sumOfIntArray(int[] myArray){
        int sum = 0;
        for(int i = 0; i < myArray.length; ++i){
          sum += myArray[i];
        }
        return sum;
      }//end of sumOfIntArray method
  
  
  
  
  
  //3.Write a public static method called "toPower" that takes in as parameters two integers called size and power. The method should return an array of size "size" with each array index raised to the value of "power." So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].
    public static int[] toPower(int size, int power){
      int[] myArray = new int[size];
      for (int i = 0; i < myArray.length; ++i){
        myArray[i] = (int)Math.pow(i, power);
      }
      return myArray;
    }//end of toPower method
  
}
