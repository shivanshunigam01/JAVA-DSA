import java.util.*;

public class Permutation1 {

    static void permute(String str, String answer) {
        if (str.length() == 0) {
            System.out.print(answer + "  ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left_substr = str.substring(0, i);
            String right_substr = str.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String str = in.nextLine();

        String answer = "";

        System.out.print("\n all possible strings are : ");
        permute(str, answer);
    }

}