import java.util.Scanner;

public class Print2xDigit {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        float number = input.nextFloat();

        float number2x = number * 2;

        System.out.printf("%d", number2x);
    }
}

