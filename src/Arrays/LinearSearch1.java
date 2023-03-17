package Arrays;

import java.util.Scanner;

public class LinearSearch1 {

public static int  LinearSearch(int number[],int key) {
     for(int i=0;i<number.length;i++){
        if(number[i]==key){
            return i;

        }


     }
    return -1;
}


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        int number[]={2,5,4,8,6,7,9};
        
        System.out.println("Enter the key you want to search for:");
        int key=sc.nextInt();
        int index=LinearSearch(number, key);
        
        if(index==-1){
            System.out.println("Key not present in the array!");
        }
        else{
        System.out.println("Our key is at index:"+LinearSearch(number, key));
    }
}
}
