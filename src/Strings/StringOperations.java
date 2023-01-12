package Strings;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first="shiva";
        String second="Nigam";
        String Full_name=first+" "+second; //<<-------- manually joins two strings
    
        //find length of the string
    System.out.println(Full_name.length());

        //To print each element of string
        for(int i=0;i<Full_name.length();i++){
            System.out.println(Full_name.charAt(i));
        }

    }
}
    
        

