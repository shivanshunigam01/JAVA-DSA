package Searching;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
    
    System.out.println("declare:");
    //size
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int score[]=new int[size];

    System.out.println("Input:");
    //input
    for(int i=0;i<size;i++){
        score[i]=sc.nextInt();
    }
  
        //FInd
        System.out.println("Lets find:");
        int x=sc.nextInt();
    
    //Output
    for(int i=0;i<size;i++){
       // System.out.println(score[i]);
       if(score[i]==x){
        System.out.println("Number found at:"+ i);
       }
       
       else{
        System.out.println("Item is not preseted in the Array");
       }
    }   
}
}
