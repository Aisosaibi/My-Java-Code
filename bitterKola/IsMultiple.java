import java.util.Scanner;

public class IsMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int multiple = input.nextInt();

        System.out.print("Input factor: ");
        int factor = input.nextInt();
    
        if (multiple % factor == 0) {
            System.out.printf("%d is a multiple of %d%n", multiple, factor);
        }

        if (multiple % factor != 0) {
            System.out.printf("%d is not a multiple of %d%n", multiple, factor);
        }
    } 
}
