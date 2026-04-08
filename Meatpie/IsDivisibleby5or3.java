import java.util.Scanner;

public class IsDivisibleby5or3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        
        if (number % 5 == 0) {
            if  (number % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            System.out.println("Buzz");       
        }
   
        if (number % 3 == 0) {
            System.out.println("Fizz");
        }
    }     
}
