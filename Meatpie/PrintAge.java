import java.util.Scanner;

public class PrintAge {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");

        String age = input.nextLine();

        System.out.printf("You are %d years old.", age);
    }
}

