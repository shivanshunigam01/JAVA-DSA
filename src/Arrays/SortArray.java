package Arrays;
import java.util.Arrays;
public class SortArray {

    public static void main(String[] args) {
        
        int array[]={2,5,6,9,8,4,7,6,3,1};
        Arrays.sort(array);
        System.out.print("The sorted array is:");
        for(int i=0;i<array.length;i++){
        System.out.print(" "+array[i]);
        
        }
    }
}
