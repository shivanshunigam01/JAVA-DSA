package Data_Mining;
import java.util.Scanner;
public class MinMaxNormalization {
    

    public static double[] minMaxNormalization(double[] data) {
        double min = data[0];
        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
            if (data[i] > max) {
                max = data[i];
            }
        }
        double range = max - min;
        double[] normalizedData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            normalizedData[i] = (data[i] - min) / range;
        }
        return normalizedData;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

 double[] data = {1, 2, 3, 4, 5};
        double[] normalizedData = minMaxNormalization(data);
        System.out.println("Original Data: " +(data));
        System.out.println("Normalized Data: " + (normalizedData));
    }

}
