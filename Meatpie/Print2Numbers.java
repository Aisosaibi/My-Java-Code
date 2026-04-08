import java.util.Scanner;

public class Print2Numbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.printf("%d%n, %d%n", number1, number2);
    }
}
