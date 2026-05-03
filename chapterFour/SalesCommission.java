/* EXERCISE 4.19 
A large company pays its salespeople on a commission basis. 
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.

PSEUDOCODE:

Obtain input from user. User can be sentinel value...
200 dollars is a constant to be added to 9% of the input

initialize totalSales = 0.0

prompt the user to enter the first item value
print "Enter item value (-1 to stop): "
read itemValue

while itemValue != -1 (or while the user has not yet entered the sentinel):
    totalSales = totalSales + itemValue
    print "Enter item value (-1 to stop): "
    read itemValue

earnings = 200 + (0.09 * totalSales)
print "Earnings: $" + earnings

But I can't lie, it's confusing... the part of the values of items shown in a table
*/

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input - new Scanner(System.in);
        int totalSales = 0;
        int earnings = 0;

        System.out.prompt("Enter item value (-1 to stop): ");
        int itemValue = input.nextInt();

        while (itemValue != -1) {
            totalSales = totalSales + itemValue
            System.out.print("Enter item value (-1 to stop): ");
            itemValue = input.nextInt();
        }

        earnings = 200 + (0.09 * totalSales);
        System.out.print("Earnings: $" + earnings);
    }
}
