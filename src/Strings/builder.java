package Strings;
import java.util.*;
public class builder {
    public static void main(String[] args) {
        StringBuilder sc=new StringBuilder("Tony");
        System.out.println(sc);
        System.out.println(sc.charAt(0)); //<<<------------character at 0 index
        
        sc.setCharAt(0,'p');
        System.out.println(sc);

        // sc.insert(0,'S');
        // System.out.println(sc);

        // //write from spony to sponny
        // sc.insert(3, 'n');
        // System.out.println(sc);

        // //delte the extra e from Spoeny
        // sc.delete(3,4);

        // //delete the extra n from Sponny
        // sc.delete(3,3);
        // System.out.println(sc);

        // //Make from Spony to Spy
        // sc.delete(2,4);
        // System.out.println(sc); 

        sc.insert(4, "Tail");
        System.out.println(sc);

        sc.delete(4, sc.length());
        System.out.println(sc);
    }
}
