package GFG_Problems;

import java.util.Scanner;

public class Swap_three_numbers {

  
        
 public static void main(String[] args) {
        int n1,n2;
    
        Scanner sc=new Scanner(System.in);
         n1=sc.nextInt();
         n2=sc.nextInt();
        //  n3=sc.nextInt();
System.out.println("Let's print the swap man!");
int temp;
temp=n1;
n1=n2;
n2=temp;
System.out.println(n1);
System.out.println(n2);

    }



}
