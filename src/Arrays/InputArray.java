package Arrays;

import java.util.Scanner;

import Loops.loop_arraysinput;

public class InputArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array!");
        int size=sc.nextInt();
        int number[]=new int[size];
        
        for(int i=0;i<size;i++){
            System.out.println("Enter the element!!");
            number[i]=sc.nextInt();
        }

        sc.close();


        //Loop
        //For displaying the array

        for(int i=0;i<number.length;i++){
            System.out.println(""+number[i]);
        }
        System.out.println("");
    }
}
