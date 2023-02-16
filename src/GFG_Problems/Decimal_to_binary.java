package GFG_Problems;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
public class Decimal_to_binary {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        BufferedReader reader=new BufferedReader(new  InputStreamReader(System.in));
        int number=Integer.parseInt(reader.readLine(),2);
        System.out.println(number);
        
    }
}
