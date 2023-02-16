package GFG_Problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.println("Enter the nubmer you want to check th factorial:");
        int number=sc.nextInt();
        
        for(int i=1;i<=number;i++){
            fact=fact*i;
       
           
        }
System.out.println(fact);
        
    }
}
