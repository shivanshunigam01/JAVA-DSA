package GFG_Problems;

import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the nubmer you want to count:");
        int nubmer=sc.nextInt();

       while(nubmer>0){
            nubmer=nubmer/10;
        count++;
        }
       
        System.out.println(count);
    }
}
