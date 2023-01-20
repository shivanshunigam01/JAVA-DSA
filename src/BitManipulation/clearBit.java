package BitManipulation;

public  class clearBit{ 
public static void main(String[] args) {
    int number=5;
    int position=2;
    int bitMask=1<<position;
    int notBit=~(bitMask);
    int newNumber=notBit& number;
    System.out.println(newNumber);


}
    
}
