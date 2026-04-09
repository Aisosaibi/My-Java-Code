import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        
        for (int i = 0; i < number; i++)
            System.out.println(i + 1);
    }
}

