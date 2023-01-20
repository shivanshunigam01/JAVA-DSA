package BitManipulation;

public class getOperation {
    public static void main(String[] args) {
        int number=5,position=2,bitMask=1<<position;

        if((bitMask & number)==0){
            System.out.println("Bit was Zero");

        }

        else{
            System.out.println("Bit was one");
        }


    }
}
