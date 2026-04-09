// Sort5num explained

import java.util.Scanner;

public class Sort5nos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double number3 = input.nextDouble();

        System.out.print("Enter fourth number: ");
        double number4 = input.nextDouble();

        System.out.print("Enter fifth number: ");
        double number5 = input.nextDouble();

        double largest_num;

        // Compare 1 and 2
        if (number2 > number1) {
            largest_num = number2;
        } 
        else {
            largest_num = number1; // if I initialized largest_num to number1, this block would have been unnecessary
        }

        // Compare current largest with 3
        if (number3 > largest_num) {
            largest_num = number3;
        }
//        else {
//            largest_num = largest_num = number2; // stays the same
//        }

        // Compare current largest with 4
        if (number4 > largest_num) {
            largest_num = number4;
        } 
//        else {
//            largest_num = largest_num = number3; // stays the same
//        }
//
        // Compare current largest with 5
        if (number5 > largest_num) {
            largest_num = number5;
        } 
//        else {
//            largest_num = largest_num = number4; // stays the same
//        }
//
        System.out.printf("The largest number is: %.2f%n", largest_num);
    }
}
