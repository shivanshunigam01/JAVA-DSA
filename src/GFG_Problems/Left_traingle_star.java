package GFG_Problems;

public class Left_traingle_star {
    public static void main(String[] args) {
        System.out.println("Let's print left trainlge star pattern in java");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}