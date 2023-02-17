package GFG_Problems;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int Number=sc.nextInt();

        for(int i=1;i<=Number;i++){
            if(Number%i==0){
                System.out.println(+Number+" Is divisble by " +i);
            }
        }
    }
}
