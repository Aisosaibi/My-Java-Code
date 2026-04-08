import java.util.Scanner;

public class PrintFavColor {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your favorite color: ");

        String color = input.nextLine();

        System.out.printf("Your favorite color is", color);
    }
}
