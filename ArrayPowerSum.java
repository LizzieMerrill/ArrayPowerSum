import java.util.*;

class ArrayPowerSum {
  public static void main(String[] args) {
    
    //1. Write a program to sum all the values of a given Array in Java.
      public static int sumOfIntArray(int[] myArray){
        int sum = 0;
        for(int i = 0; i < myArray.length; ++i){
          sum += myArray[i];
        }
        return sum;
      }//end of sumOfIntArray method
    
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
    
    
    
    //3.Write a public static method called "toPower" that takes in as parameters two integers called size and power. The method should return an array of size "size" with each array index raised to the value of "power." So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].
    public static int[] toPower(int size, int power){
      int[] myArray = new Array[size];
      for (int i = 0; i < myArray.length; ++i){
        myArray[i] = Math.pow((double)i, (double)power);
      }
      return myArray;
    }//end of toPower method
    
    
    
  }
}
