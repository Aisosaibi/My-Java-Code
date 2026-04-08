import java.util.Scanner;

public class DistanceUnitConverter {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("*MILES TO KILOMETER CONVERTER*\nMile(s): ");
        double distance_in_miles = input.nextDouble();

        double distance_in_kilometers = distance_in_miles * 1.6;

        System.out.printf("Distance in kilometer: %.2f%n", distance_in_kilometers);
        Scanner.close();
    }
}
