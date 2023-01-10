package Arrays;

import java.util.Scanner;

public class IID_array {
   // private static final int[][] Matrix = null;

    private static String[][] matix;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Initialize size
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int [][]matrix= new int[rows][col];

        //Input
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        
        
            //Output
            for(int k=0;k<rows;k++){
                for(int j=0;j<col;j++){
                    System.out.println(matix[k][j]+" ");
                }

            }
        
        
        
        }









    }
}
