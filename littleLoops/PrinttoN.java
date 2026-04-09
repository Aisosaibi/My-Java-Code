import java.util.Scanner;

public class PrinttoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++)
            System.out.println(i);
    }
}
