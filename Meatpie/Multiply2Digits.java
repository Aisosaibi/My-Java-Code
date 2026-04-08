import java.util.Scanner;

public class Multiply2Digits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Hint: Ensure whole numbers.\nEnter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.printf("Sum: %d%n", (number1 * number2));
    }
}
