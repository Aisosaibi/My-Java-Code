import java.util.Scanner;

public class Subtract2Digits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Hint: Keep within 1 decimal place.\nEnter first number: ");
        float number1 = input.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = input.nextFloat();

        System.out.printf("Sum: %.1f%n", (number1 - number2));
    }
}
