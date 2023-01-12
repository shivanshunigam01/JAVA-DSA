package Strings;

public class Substring {
    public static void main(String[] args) {
        String sentance="Vit bhopal is the best university";
        String subString=sentance.substring(0,22);    //<<<----- Trims the string according to the range
        System.out.println(subString);
        String substring2=sentance.substring(23);
        System.out.println(substring2);
    }
}
