/* ask user to enter n
from 1 to n
    calculate 2 raised to the power of that number
    print result */

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }
    }
}
