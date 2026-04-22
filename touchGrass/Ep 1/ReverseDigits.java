/* ask the user to enter a positive integer
while the number still get digits remaining
    get the last digit using remainder of 10
    add to reversed number (shift existing digits left first)
    remove the last digit from original number by dividing by 10
print the reversed number */

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed + digit;
            num /= 10;
        }
        System.out.println("Reversed: " + reversed);
    }
}
