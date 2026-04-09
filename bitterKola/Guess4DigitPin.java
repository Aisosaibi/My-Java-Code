import java.util.Scanner;

public class Guess4DigitPin {
    public static void main(String[] args) {

        int pin = 4278; // arbitrarily set pin

        Scanner input = new Scanner(System.in);
        System.out.print("Guess 4 digit pin: ");
        int passcode = input.nextInt();

        if (passcode == pin) {
        System.out.println("Correct pin!");
        }

        if (passcode != pin) {
        System.out.println("Incorrect pin!");
        }
    }
}
