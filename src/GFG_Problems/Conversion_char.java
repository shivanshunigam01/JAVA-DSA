package GFG_Problems;

import java.util.Scanner;

public class Conversion_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char ch2;
        if(ch>='A' && ch<='Z'){
            ch2=Character.toLowerCase(ch);
            System.out.println(ch2);
        }
else{
        ch2=Character.toUpperCase(ch);
        System.out.println(ch2);
    }
}
}
