package Function;
import java.util.*;
public class Function_additon {
    public static int Addition(int a, int b){
        int sum=a+b;    
        return sum;
 
    }
      public static int Product(int a, int b){
        int result=a*b;
        return result;
      }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("multiple of a and b is :"+Product(a, b));
  
  
    }
}
