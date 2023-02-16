package GFG_Problems;

import java.util.Scanner;

public class Power_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=1;
        System.out.println("Enter number!");
         int num=sc.nextInt();

         System.out.println("Enter power!");

         int pow=sc.nextInt();


        for(int i=1;i<=pow;i++){
            result=result*num;
        }
        System.out.println(result);

    }
}
