package GFG_Problems;

import java.util.Scanner;

public class Reverse_a_number
 {
   public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any number:");
    int n=sc.nextInt();
int r;
System.out.print("The reverse order of "+n+" will be :");
    while(n>0){
        r=n%10;
      
        System.out.print(r);
        n=n/10;

    }










   } 
}
