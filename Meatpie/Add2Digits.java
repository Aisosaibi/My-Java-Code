import java.util.Scanner;

public class Add2Digits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter Second integer: ");
        int number2 = input.nextInt();

        System.out.printf("Sum: %d", (number1 + number2));
    }
}
