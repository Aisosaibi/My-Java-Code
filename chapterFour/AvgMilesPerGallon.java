/* Exercise 4.17: 
Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point. All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data from the user.

PSEUDOCODE:

Initialize miles to zero (int)
Initialize gallon to zero (int)
Initialize total distance (int)
Initialize total fuel (gallon) (int)
Initialize miles per gallon to zero (double)
Initialize driver counter to zero (int) (possibly the sentinel)

Prompt user for the first miles driven
Prompt user for the first gallon measure

While the user has not yet entered the sentinel value for miles driven
    While the user has not yet entered the sentinel values for gallon measure
(I can probably collapse both into one statement using the and statement)
        Increment driver counter
        miles per gallon = (double) miles/gallon
        print("Driver %d: %.2f", driver counter, miles per gallon)

        Add miles to the running total distance
        Add gallon to the running gallon total
        Prompt user for next miles driven
        Prompt user for next gallon measure 

If driver count is not equal to zero
    Calculate total fuel divided by total distance
    Print the average
Else
    Print "No grades were entered"

*/

import java.util.Scanner;

public class AvgMilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallon = 0;
        double milesPerGallon = 0.0;
        int driverCounter = 0;

        System.out.print("Enter miles or -1 to quit: ");
        int miles = input.nextInt();
        System.out.print("Enter gallon or -1 to quit: ");
        int gallon = input.nextInt();

        while (miles != -1 && gallon != -1) {
            driverCounter++;
            milesPerGallon = (double) miles/gallon;
            System.out.printf("Driver %d: %.1f miles per gallon%n", driverCounter, milesPerGallon);

            totalMiles += miles;
            totalGallon += gallon;

            System.out.print("Enter miles or -1 to quit: ");
            miles = input.nextInt();
            System.out.print("Enter gallon or -1 to quit: ");
            gallon = input.nextInt();
        }

        if (driverCounter != 0) {
            double totalMilesPerGallon = (double) totalMiles/totalGallon;
            System.out.printf("Average across drivers: %.1f%n", totalMilesPerGallon);
        } else {
            System.out.println("No valid inputs received");
        }
    }
}
