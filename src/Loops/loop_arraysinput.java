package Loops;
import java.util.Scanner;
public class loop_arraysinput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Size intialise
       System.out.println("Enter the desired size of the array:");
      
      int size=sc.nextInt();
       int marks[]=new int[size];

        
        //input
        System.out.println("Insert the elements of Array:");
        for(int i=0;i<size;i++){
             marks[i]=sc.nextInt();
        }        
        

        //Output
        System.out.println("Show the elements of Array:");
            for(int i=0;i<size;i++){
            System.out.print(marks[i]+" ");
            }
            //marks[i]=sc.nextInt();
           
        
        }






    }

