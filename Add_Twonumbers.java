Add_TwoNumbers :

import java.util.Scanner;

public class AddTwoNumbers{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    
    System.out.print("Enter First Number:");
    int num1=scanner.nextInt();
  
    System.out.print("Enter Second Number:");
    int num2=scanner.nextInt();

    int sum=num1+num2;
    System.out.println("The Sum is :"+sum);
  }
}