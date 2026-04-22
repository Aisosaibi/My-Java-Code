/* create a list to hold numbers
keep asking user to enter number
    if number is negative, comot from loop
    otherwise add am to the list
calculate average of all numbers for the list
print the average */

import java.util.Scanner;

public class AveragePositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            if (number < 0) break;
            sum += number;
            count++;
        }

        if (count == 0) {
            System.out.println("No positive numbers entered.");
        } else {
            System.out.println("Average: " + sum / count + 1);
        }
    }
}
