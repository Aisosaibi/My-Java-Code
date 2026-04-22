/* ask user to enter major letter (I, C, or A)
ask user to enter year digit (1 to 4)

use the major letter to select course
    I = Information Management
    C = Computer Science
    A = Accounting

use the year digit to select year
    1 = Freshman | 2 = Sophomore | 3 = Junior | 4 = Senior

print both together
if any input is invalid, tell the user */

import java.util.Scanner;

public class MajorAndYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter major (I/C/A): ");
        char major = scanner.next().toUpperCase().charAt(0);
        System.out.print("Enter year (1-4): ");
        int year = scanner.nextInt();

        String majorName;
        switch (major) {
            case 'I': majorName = "Information Management"; break;
            case 'C': majorName = "Computer Science"; break;
            case 'A': majorName = "Accounting"; break;
            default: majorName = null;
        }

        String yearName;
        switch (year) {
            case 1: yearName = "Freshman"; break;
            case 2: yearName = "Sophomore"; break;
            case 3: yearName = "Junior"; break;
            case 4: yearName = "Senior"; break;
            default: yearName = null;
        }

        if (majorName == null || yearName == null) {
            System.out.println("Input valid");
        } else {
            System.out.println(majorName + " - " + yearName);
        }
    }
}
