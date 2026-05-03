/* START

Ask the user to enter the first day of their last period (a date)
Ask the user to enter how long their cycle usually lasts (in days) — default is 28
Ask the user to enter how long their period flow usually lasts (in days) — default is 5

Calculate:
  - Next period start date = last period date + cycle length
  - Period end date = last period start date + flow duration
  - Ovulation date = next period start date - 14 days
  - Fertile window start = ovulation date - 2 days
  - Fertile window end = ovulation date + 2 days
  - Safe period = any days outside the fertile window

Display:
  - Next period date
  - Current flow end date
  - Ovulation date
  - Fertile window (start to end)
  - Safe days before fertile window
  - Safe days after fertile window

END */


import java.time.LocalDate;
import java.util.Scanner;

public class MenstrualApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Menstrual Cycle Calculator =====");

        System.out.print("Enter the year your last period started (e.g. 2026): ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        System.out.print("Enter your average cycle length in days (press 0 to use default of 28): ");
        int cycleLength = scanner.nextInt();
        if (cycleLength == 0) cycleLength = 28;

        System.out.print("Enter how many days your flow usually lasts (press 0 to use default of 5): ");
        int flowDuration = scanner.nextInt();
        if (flowDuration == 0) flowDuration = 5;

        // Build the date of last period
        LocalDate lastPeriodStart = LocalDate.of(year, month, day);

        // Calculate key dates
        LocalDate periodEndDate    = lastPeriodStart.plusDays(flowDuration);
        LocalDate nextPeriodStart  = lastPeriodStart.plusDays(cycleLength);
        LocalDate ovulationDate    = nextPeriodStart.minusDays(14);
        LocalDate fertileStart     = ovulationDate.minusDays(2);
        LocalDate fertileEnd       = ovulationDate.plusDays(2);

        // Safe periods
        LocalDate safeBeforeEnd    = fertileStart.minusDays(1);
        LocalDate safeAfterStart   = fertileEnd.plusDays(1);

        // BUG: integer division loses the decimal — should be (cycleLength * 1.0) / 2
        double halfCycle = cycleLength / 2;

        System.out.println("\n===== YOUR CYCLE REPORT =====");
        System.out.println("Last Period Started       : " + lastPeriodStart);
        System.out.println("Period Flow Ends          : " + periodEndDate);
        System.out.println("Next Period Expected      : " + nextPeriodStart);
        System.out.println("Ovulation Date            : " + ovulationDate);
        System.out.println("Fertile Window            : " + fertileStart + " to " + fertileEnd);
        System.out.println("Safe Days (before fertile): " + lastPeriodStart + " to " + safeBeforeEnd);
        System.out.println("Safe Days (after fertile) : " + safeAfterStart + " to " + nextPeriodStart.minusDays(1));
        System.out.println("Approx. Half Cycle        : " + halfCycle + " days");
        System.out.println("=============================");
        System.out.println("Note: This is an estimate. Cycles vary per individual.");

        scanner.close();
    }
}
