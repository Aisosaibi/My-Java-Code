import java.util.Scanner;

public class PrintHalves {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        float number = input.nextFloat();

        float half_number = number / 2;

        System.out.printf("%d", half_number);
    }
}


