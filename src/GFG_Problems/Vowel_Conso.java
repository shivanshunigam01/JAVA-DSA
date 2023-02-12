package GFG_Problems;
import java.util.Scanner;
import java.util.*;

public class Vowel_Conso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Accept the word!");
        char c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){

            System.out.println("Yes its a vowel");
        }
        else{
            System.out.println("It's a Consonent!");
        }
        
    }
   








}
