import java.util.Scanner;

public class TimeSum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Initial Time (hh:mm): ");
        String time1 = input.nextLine();
        String[] parts1 = time1.split(":");
        int hour1 = Integer.parseInt(parts1[0]);
        int minute1 = Integer.parseInt(parts1[1]);

        System.out.print("Time Since (hh:mm): ");
        String time2 = input.nextLine();
        String[] parts2 = time2.split(":");
        int hour2 = Integer.parseInt(parts2[0]);
        int minute2 = Integer.parseInt(parts2[1]);

        int sum_minutes = minute1 + minute2;
        int sum_hours = hour1 + hour2;

        if (sum_minutes >= 60) {
            int min_to_hr = sum_minutes / 60;
            int minutes = sum_minutes % 60;
        }

        sum_hours = sum_hours % 24;

        System.out.printf("The total time is %02d:%02d%n", sum_hours, sum_minutes);
    }
}
