/* create total count variable
loop from 1 to 7 (first number)
    loop from first number + 1 to 7 (second number)
        print the pair
        increase total count
print total count for all combinations */

public class Combinations {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = i; j <= 7; j++) {
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("Total combinations: " + count);
    }
}
