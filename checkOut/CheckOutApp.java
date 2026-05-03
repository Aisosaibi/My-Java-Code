/* START

Ask cashier to enter their name
Ask for the customer's name

Ask how many different products the customer is buying

FOR each product:
    Ask for the product name
    Ask for the product price
    Ask for the quantity purchased
    Calculate line total = price × quantity
    Store the product name, price, quantity, and line total

Calculate:
    subtotal = sum of all line totals
    discount = 8% of subtotal  (if subtotal qualifies)
    VAT      = 7.5% of subtotal
    bill total = subtotal - discount + VAT

Ask how much cash the customer gave
Calculate balance = amount paid - bill total

Print the invoice:
    - Store name, branch, location, date, time
    - Cashier name and customer name
    - Table of items: name, quantity, price, line total
    - Subtotal, discount, VAT
    - Bill total, amount paid, balance
    - Thank you message

END */



import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckoutApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Store details
        String storeName = "SEMICOLON STORES";
        String branch    = "MAIN BRANCH";
        String location  = "312, HERBERT MACAULAY WAY, SABO YABA, LAGOS";
        String tel       = "03293828343";

        // Date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy hh:mm:ss a");
        String dateTime = now.format(formatter);

        System.out.print("Enter cashier name: ");
        String cashierName = scanner.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("How many different products is the customer buying? ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // Arrays to store cart items
        String[] productNames = new String[numProducts];
        double[] productPrices = new double[numProducts];
        int[] quantities = new int[numProducts];
        double[] lineTotals = new double[numProducts];

        // Collect each product
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name for item " + (i + 1) + ": ");
            productNames[i] = scanner.nextLine();

            System.out.print("Enter price for " + productNames[i] + ": ");
            productPrices[i] = scanner.nextDouble();

            System.out.print("Enter quantity for " + productNames[i] + ": ");
            quantities[i] = scanner.nextInt();
            scanner.nextLine();

            lineTotals[i] = productPrices[i] * quantities[i];
        }

        // Calculate totals
        double subtotal = 0;
        for (int i = 0; i < numProducts; i++) {
            subtotal = subtotal + lineTotals[i];
        }

        double discountRate = 0.08;
        double vatRate      = 0.075;

        // BUG: VAT is being calculated on subtotal instead of (subtotal - discount)
        // In the sample output VAT is applied after discount, not before
        double discount  = subtotal * discountRate;
        double vat       = subtotal * vatRate;       // <-- should be (subtotal - discount) * vatRate
        double billTotal = subtotal - discount + vat;

        System.out.print("\nHow much did the customer give to you? ");
        double amountPaid = scanner.nextDouble();

        double balance = amountPaid - billTotal;

        // Print the invoice
        String divider  = "=".repeat(52);
        String subLine  = "-".repeat(52);

        System.out.println("\n" + divider);
        System.out.println(storeName);
        System.out.println(branch);
        System.out.println("LOCATION: " + location);
        System.out.println("TEL: " + tel);
        System.out.println("Date : " + dateTime);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println(divider);
        System.out.printf("%-20s %5s %10s %12s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println(subLine);

        for (int i = 0; i < numProducts; i++) {
            System.out.printf("%-20s %5d %10.2f %12.2f%n",
                    productNames[i], quantities[i], productPrices[i], lineTotals[i]);
        }

        System.out.println(subLine);
        System.out.printf("%35s %12.2f%n", "Sub Total:",  subtotal);
        System.out.printf("%35s %12.2f%n", "Discount:",   discount);
        System.out.printf("%35s %12.2f%n", "VAT @ 7.50%:", vat);
        System.out.println(divider);
        System.out.printf("%35s %12.2f%n", "Bill Total:",   billTotal);
        System.out.printf("%35s %12.2f%n", "Amount Paid:",  amountPaid);
        System.out.printf("%35s %12.2f%n", "Balance:",      balance);
        System.out.println(divider);
        System.out.println("         THANK YOU FOR YOUR PATRONAGE");
        System.out.println(divider);

        scanner.close();
    }
}
