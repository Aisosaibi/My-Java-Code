import java.util.Scanner;

public class TaskTwo {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double average = 0;
		double number = 0.0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number: ");
			number = input.nextDouble();
			sum = number + sum;
		}
		average = sum / number;
		System.out.printf("Average is %.2f%n", average);
	}
}
