import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ener first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter Second integer: ");
        int number2 = input.nextInt();

        System.out.printf("Sum: %d%n", (number1 + number2));
    }
}

