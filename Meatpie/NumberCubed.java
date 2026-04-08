import java.util.Scanner;

public class NumberCubed {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");

        float number = input.nextFloat();

        double num_cubed = Math.pow(number, 3);
        System.out.println("Your number cubed is " + num_cubed);
    }
}
