package Arrays;

public class Arraycc {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;

        }
    }

    public static void main(String[] args) {
        // int marks[]= new int [3];
        int marks[]={20,30,40};
        update(marks);


        //printing array

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
    System.out.println();
}
}
