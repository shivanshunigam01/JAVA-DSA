package GFG_Problems;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int compare=n,r;

        int sum=0;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
    
    if(compare==n){
        System.out.println("Palindrome found!");
    }
    else{
        
        System.out.println("Palindrome Not found!");
    }

    
    }
}
