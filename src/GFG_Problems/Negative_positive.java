package GFG_Problems;

import java.util.Scanner;

public class Negative_positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        if(n>0){
            System.out.println("Hey this is a positive number!");

        }
    
    
        else if(n<0){
            System.out.println("Hey this is a negative number!");

        }
        else{
            System.out.println("Nubmer is not positive or neagtive!");
        }
    }
}
