package GFG_Problems;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Average_of_sub {
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    int a,b,c,d,e;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    
int sum=a+b+c+d+e;
System.out.println("Sum of marks will be:"+sum);
int average=sum/5;
System.out.println(average);





    }

    
}
