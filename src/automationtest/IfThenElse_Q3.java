package automationtest;

import java.util.Scanner;

public class IfThenElse_Q3 {
   public boolean isTeen(int age){
       if(age<=18){
           return true;
       } else {
           return false;
       }
   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = input.nextInt();
        IfThenElse_Q3 obj = new IfThenElse_Q3();
        System.out.println(obj.isTeen(age));

    }
}
