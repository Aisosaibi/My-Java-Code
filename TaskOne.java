import java.util.Scanner;

public class TaskOne {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number: ");
			double number = input.nextDouble();
			sum = number + sum;
		}
		System.out.printf("Sum is %.1f%n", sum);
	}
}
