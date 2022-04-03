package automationtest;

import java.util.Scanner;

public class ForLoop_Q4 {
  // Create a method with the name "printMyName" with no return type and two parameters
  // with the type string and name "name" and int type name 'howManyTime'.
   public void printMyName(String name,int howManyTime){
     // Write the for loop into the "printMyName '' method which " +
       // "prints your name depending upon howManyTime's value.
      for(int i = 1;i<=howManyTime;i++){
         System.out.println(name);
      }
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the howManyTime Print your name : ");
      int howManyTime = input.nextInt();
      System.out.print("Enter the your name : ");
      String name = input.next();

      ForLoop_Q4 obj = new ForLoop_Q4();
      obj.printMyName(name,howManyTime);

   }
}
