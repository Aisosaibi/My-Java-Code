import java.util.Scanner;

public class NumberSquared {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");

        float number = input.nextFloat();

        double num_squared = Math.pow(number, 2);
        System.out.println("Your number squared is " + num_squared);
    }
}
