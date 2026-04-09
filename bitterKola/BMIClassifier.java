import java.util.Scanner;

public class BMIClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Weight (kg): ");
        int weight = input.nextInt();

        System.out.print("Height (m): ");
        int height = input.nextInt();
        
        double bmi = weight / Math.pow(height, 2);    

        if (bmi < 18.5) {
            System.out.printf("Underweight (<18.5)");
        }

        if (18.5 <= bmi && bmi <= 24.9) {
            System.out.printf("Normal (18.5 - 24.9)");
        }

        if (bmi > 24.9) {
            System.out.printf("Overweight (>24.9)");
        }

    } 
}
