package GFG_Problems;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Principal");
        int Principal=sc.nextInt();

        // System.out.println("Enter the Interest");
        // int Interest=sc.nextInt();

        System.out.println("Enter the Rate");
        int rate=sc.nextInt();
        
        System.out.println("Enter the time");
        int time=sc.nextInt();

        int Simple_interest=(Principal*rate*time/100);

        System.out.println("The simple interest will be :"+Simple_interest);





    }
}
