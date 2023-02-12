package GFG_Problems;
import java.util.Scanner;
public class Factorial_number {
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number!");
    int num=sc.nextInt();
int fact=1;
for(int i=1;i<=num;i++){
    fact=fact*i;

}
System.out.println("factorial of the number is "+fact);
    







}
}
