/* ask user to enter a number
from 1 till that number
    if the number can be divided without remainder
        print it (it's a factor) */

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
