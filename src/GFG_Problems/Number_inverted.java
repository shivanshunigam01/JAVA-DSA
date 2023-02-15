package GFG_Problems;

public class Number_inverted {
    public static void main(String[] args) {
     System.out.println("Opposite pyramid in java");   
     int n=4;
     for(int i=1;i<=n;i++){
        for(int k=1;k<=4-i;k++){
            System.out.print(" ");
        }
     
        for(int j=1;j>i;j-- ){
            System.out.println(j);
        }
    System.out.println("");
    }
    }
}
