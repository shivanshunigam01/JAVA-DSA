package Loops;
import java.util.Scanner;
public class table_of2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result;
        System.out.println("enter the number:"); //for multiply
        int number=sc.nextInt();

        for(int i=1; i<11; i++){
            result=i*number;
            System.out.println(result);

        }
    }
}
