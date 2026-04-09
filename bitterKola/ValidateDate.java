import java.util.Scanner;

public class ValidateDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date (dd:mm:yy): ");
        String date = input.nextLine();

        String[] parts = date.split(":");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (year > 99) {
        System.out.println("Invalid date: adjust year!");
        

            else if (month > 12) {
            System.out.println("Invalid date: confirm month!");
            }

            if (day > 29) {
                if (month == 2) {
                    System.out.println("Invalid date: confirm date!");
                }

                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 30) {
                        System.out.println("Invalid date: confirm date!");
                    }
                }
            }

            else if (day > 31) {
                System.out.println("Invalid date: confirm day!");
            }
    }
}
