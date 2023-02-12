package GFG_Problems;

import java.util.Scanner;

public class Fibonaci {

    public static void main(String[] args) {
        int term, a = 0, b = 1, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        term = sc.nextInt();

        for (int i = 1; i <= term; i++) {
            
            System.out.print(+a+" ");
            sum = a + b;
            a = b;
            b = sum;

        }

    }

}
