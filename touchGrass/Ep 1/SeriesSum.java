/* start sum at 0
the pattern be: numerator start at 1, denominator start at 3
each time, numerator increase by 2, denominator increase by 2
stop when denominator reach 101
add each fraction to sum
print final sum */

public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 99; i += 2) {
            sum += (double) i / (i + 2);
        }
        System.out.println("Sum: " + sum);
    }
}
