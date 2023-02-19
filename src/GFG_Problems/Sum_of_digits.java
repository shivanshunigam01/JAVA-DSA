package GFG_Problems;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int reverse,sum=0;

        while(n>0){
            reverse=n%10;r
            n=n/10;
            sum=reverse+sum;
        }
        System.out.println(sum);
    }
}
