PrimeCheck :

import java.util.Scanner;
public class checkprime{
  public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter a number:");
    int num=scanner.nextInt();
    boolean isprime=true;
    
    if(num<=1){
      isprime=false;
    }else{
      for(int i=2; i<num/2; i++){
         if(num%i==0){
           isprime=false;
             break;
      }
  }
}
  if(isprime){
     System.out.println(num+ " is a prime number.");
  }else{
     System.out.print(num+ " is not a prime number. ");
}
}
}