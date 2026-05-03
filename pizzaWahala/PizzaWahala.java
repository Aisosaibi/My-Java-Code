import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of guests: ");
        int guests = input.nextInt();
        input.nextLine();

        System.out.print("Enter pizza type (Sapa size / Small Money / Big boys / Odogwu): ");
        String pizzaType = input.nextLine().trim();

        int slicesPerBox;
        int pricePerBox;

        if (pizzaType.equalsIgnoreCase("Sapa size")) {
            slicesPerBox = 4;
            pricePerBox = 2500;}
 
        else if (pizzaType.equalsIgnoreCase("Small Money")) {
            slicesPerBox = 6;
            pricePerBox = 2900;}
 
        else if (pizzaType.equalsIgnoreCase("Big boys")) {
            slicesPerBox = 8;
            pricePerBox = 4000;}

        else if (pizzaType.equalsIgnoreCase("Odogwu")) {
            slicesPerBox = 12;
            pricePerBox = 5200;} 

        else {
            System.out.println("Unknown pizza type!");
            return;
        }

        int boxesToBuy = (int) Math.ceil((double) guests / slicesPerBox);
        int totalSlices = boxesToBuy * slicesPerBox;
        int leftoverSlices = totalSlices - guests;
        int totalPrice = boxesToBuy * pricePerBox;

        System.out.println("Number of boxes of pizza to buy = " + boxesToBuy + " boxes");
        System.out.println("Number of left over slices after serving = " + leftoverSlices + " slices");
        System.out.println("Price = " + totalPrice);
    }
}
