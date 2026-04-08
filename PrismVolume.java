import java.util.Scanner;

public class PrismVolume {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter length(cm): ");
    	double length = input.nextInt();
    	double area = Math.sqrt(3)/4 * Math.pow(length, 2);
        double volume = area * length;
//	System.out.println("The volume of your triangular prism is: " + area + " cc");
	System.out.printf("The area of your triangular prism is: %.2f cc%n", volume);
    }
}
