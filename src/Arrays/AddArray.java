package Arrays;
import java.util.Scanner;
public class AddArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr1[]={1,2,3,4,5,6};
        int sum=0;

        for(int i=0;i<arr1.length;i++ ){
            sum+=arr1[i];

        }
            System.out.println(sum);
    
    }
}
