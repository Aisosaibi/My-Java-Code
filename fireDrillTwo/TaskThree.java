import java.util.Scanner;

public class TaskThree {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double average = 0;
		double number = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number: ");
			number = input.nextDouble();
			sum = number + sum;
		}
		average = sum / number;
		System.out.printf("Sum is %.1f, while Average is %.2f%n", sum, average);
	}
}
