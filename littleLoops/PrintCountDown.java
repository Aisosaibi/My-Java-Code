import java.util.Scanner;

public class PrintCountDown {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Countdown Number: ");
        int number = input.nextInt();

        for (int i = 0; i <= number; i++)
            System.out.println((number - i));
    }
}
