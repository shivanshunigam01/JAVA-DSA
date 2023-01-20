package BitManipulation;

public class setBit {
    public static void main(String[] args) {
        int number=5;
        int position=1;
        int bitMask=1<<position;

        int newNumber=bitMask | number;
        System.out.println(newNumber);
    }
}
