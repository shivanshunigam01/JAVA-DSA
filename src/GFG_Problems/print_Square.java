package GFG_Problems;

public class print_Square {
    public static void main(String[] args) {
        System.out.println("Let's print a square pattern in java ");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
