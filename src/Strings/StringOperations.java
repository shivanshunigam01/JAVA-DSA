package Strings;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first=sc.nextLine();
        String last=sc.nextLine();
        String fulname=first.concat(last);
        System.out.println("Full name is:" +first+" "+last);
        //Concatnation
        System.out.println(first.concat(last));
        //Length of tht string
        System.out.println(fulname.length());
        //CharAt
        for(int i=0;i<fulname.length();i++){
            System.out.println(fulname.charAt(i));
        }
        
        // //compare will fail
        // if(new String("hello")== new String("hello")){
        //     System.out.println("Strings are equal");
        // }
        //     else{
        //         System.out.println("Strings are not equal");
        //     }
            
            String n="name"; String z="two";
            if(n.compareTo(z)==0){
                System.out.println("Both the strings are equal");
            }
        else{
            System.out.println("Strings are not equal");
        }
        
    
        //Substring function(To cut and print the String according the range)
        String Sentance="My dad is the best dad ever!";
        String substriString=Sentance.substring(0,19);
        System.out.println(substriString);
    //NOTE- Strings are immutable(It can not be changed or updated after decleration )
    
    }
    
    }

