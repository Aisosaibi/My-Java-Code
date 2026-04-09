import java.util.Scanner;

public class PolarAlgebra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first digit: ");
        int number1 = input.nextInt();

        System.out.print("Input second digit: ");
        int number2 = input.nextInt();
    
        if (number1 >= 0 && number2 >= 0) {
            System.out.printf("%d%n", (number1 + number2));
        }

        if (number1 < 0 && number2 < 0) {
            System.out.printf("%d%n", (number1 * number2));
        }
        
        if (number1 >= 0 && number2 < 0) {
            System.out.printf("%d%n", (number1 - number2));
        }

//        else {
//            System.out.printf("%d%n", (number2 - number1));
//        }

        if (number1 < 0 && number2 <= 0) {
            System.out.printf("%d%n", (number2 - number1));
        }
    } 
}
