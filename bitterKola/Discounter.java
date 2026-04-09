import java.util.Scanner;

public class Discounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Price (amount only): ");
        String price = input.nextLine();
        price = price.replace(",", "");
        int amount = Integer.parseInt(price);

        System.out.print("Discount: ");
        String discount = input.nextLine();
        String number = discount.replace("%", "");
        int percent = Integer.parseInt(number);
  
        double newPrice = amount * (1 - percent/100.0);

        System.out.printf("Discounted Price is %.2f%n",  newPrice);
    }
}  
