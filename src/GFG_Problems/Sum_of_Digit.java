package GFG_Problems;

import java.util.Scanner;

public class Sum_of_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to add its digits:");
        int n=sc.nextInt();
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;

        }
System.out.println("sum:"+sum);

    }
}
