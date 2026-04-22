/* ask user to enter a number
from that number, count down to 1
    print each number
when you reach 1, print "Blast off!" */

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = scanner.nextInt();

        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Blast off");
    }
}
