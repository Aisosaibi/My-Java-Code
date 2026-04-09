import java.util.Scanner;

public class Sort5num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        double largest_num = number1;

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        if (number2 > number1){
            largest_num = number2;     
        }

        System.out.print("Enter third number: ");
        double number3 = input.nextDouble();
        if (number3 > number2){
            largest_num = number3;     
        }

        System.out.print("Enter fourth number: ");
        double number4 = input.nextDouble();
        if (number4 > number3){
            largest_num = number4;       
        }

        System.out.print("Enter fifth number: ");
        double number5 = input.nextDouble();
        if (number5 > number4){
            largest_num = number5;        
        }
        
        System.out.printf("Largest number is %.2f%n", largest_num);
    }
}
