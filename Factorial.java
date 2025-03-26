Factorial:

import java.util.Scanner;

public class factorial{
  public static void main (String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter a number:");
    int num=scanner.nextInt();
  
    int factorial=1; 
    for(int i=1;i<=num;i++){
        factorial*=i;
    }

    System.out.print("The Factorial of " +num+  "is"+factorial);
  }
}