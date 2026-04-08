import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter dimension(cm): ");
    	double dimension = input.nextInt();
    	double area = Math.sqrt(3)/4 * Math.pow(dimension, 2);
//	System.out.println("The area of your equilateral triangle is: " + area + " sq cm");
	System.out.printf("The area of your equilateral triangle is: %.2f sq cm%n", area);
    }
}
