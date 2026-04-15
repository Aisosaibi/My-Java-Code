import java.util.Scanner;

public class TaskSix {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double average = 0;
		double number = 0;
		int count1 = 0;
		int count2 = 0;

		for (count1 = 1; count1 <= 10; count1++) {
			System.out.print("Enter number: ");
			number = input.nextDouble();
			if (number % 2 == 0) {
				sum = number + sum;
				count2++;}
		}
		System.out.println(count2);
		average = sum / count2;
		System.out.printf("Sum is %.1f, while Average is %.2f%n", sum, average);
	}
}
