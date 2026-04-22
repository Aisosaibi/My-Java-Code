/* create a counter for how many years don print for current line
from year 2000 go to 2100
    check if the year na leap year:
        year must divide by 4
        but if e divide by 100, e must also divide by 400
    if na leap year, print am
        add 1 to counter
        if counter reach 10, start new line, reset counter */

public class LeapYears {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 2000; year <= 2100; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.print(year + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
