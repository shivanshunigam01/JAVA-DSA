package Loops;
import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        for(int i = 1; i<=n;i++){
            sum=sum+i;
        }

        System.out.println(sum);
    }
    
}
