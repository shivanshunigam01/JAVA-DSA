package Arrays;
import java.util.Scanner;
public class twoDarray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the Row:");
        int row=sc.nextInt();
        
        System.out.println("Enter the size of the Column:");
        int cols=sc.nextInt();
        int numbers[][]=new int[row][cols];


        //input
        System.out.println("Let's input the elements of the Array:");
        for(int i=0; i<row;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //Finding element
        int x=sc.nextInt();

        //output
        System.out.println("Output of the 2D array is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                //System.out.print(numbers[i][j]+" ");
                if(numbers[i][j]==x){
                    System.out.println("Element found aT location:"+i+","+j+" ");
                }
           
            }
           
        }
    
    
    
    }
}
