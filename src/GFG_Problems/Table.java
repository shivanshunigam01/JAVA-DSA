package GFG_Problems;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table nubmer:");
        int table=sc.nextInt();
        int result;

        for(int i=1; i<=10;i++){
            result=table*i;
            System.out.println(result);
        }
  


    }
}
