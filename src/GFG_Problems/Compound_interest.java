package GFG_Problems;
import java.util.Scanner;
import java.lang.Math;
public class Compound_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Principal");
        double Principal=sc.nextDouble();


        System.out.println("Enter the Rate");
        double rate=sc.nextDouble();
        
        System.out.println("Enter the time");
        double time=sc.nextDouble();

        double Compound_interest= Principal*Math.pow((1+rate / 100),time);
        double interest=Compound_interest-Principal;

        System.out.println("The simple interest will be :"+interest);
    
}
}
