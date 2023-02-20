package GFG_Problems;

import java.util.Scanner;

public class Swap_nibbles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number two swap nibbles: ");
        int n=sc.nextInt(); 
        int swap_done;
        int x=0;
        swap_done= ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
        System.out.println(swap_done);
    }
}
