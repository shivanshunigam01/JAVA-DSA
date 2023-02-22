package GFG_Problems;

public class SimpleLocation
{
    public double latitude;
    public double longitude;

    public SimpleLocation(double latIn, double lonIn)
    {
        this.latitude = latIn;
        this.longitude = lonIn;
    }

    public static void main(String[] args)
    {
        double latitude = -15.5;
        SimpleLocation lima = new SimpleLocation(latitude, -77.0);
        latitude = -12.0;
        System.out.println(lima.latitude);
        System.out.println(""+latitude);
       
    }
}