import java.util.Scanner;

public class Add1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a five digit number: ");
        int pentaDigit = input.nextInt();
    
        int digit1 = pentaDigit/10000;
        int digit5 = pentaDigit % 10;
        int sum = digit1 + digit5;

        // String pentaDigit = input.nextLine();
     
        // int digit1 = pentaDigit.charAt(0) - '0';
        // int digit5 = pentaDigit.charAt(0) - '0';
        // int sum = digit1 + digit5;

        System.out.printf("Total is %d%n", sum);
    }
} 
