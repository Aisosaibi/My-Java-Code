ask user keep entering integers
/* stop when user enter 0
track the largest number wey don enter
track how many times that largest number appear
if new number pass current largest
    update largest, reset count to 1
if new number equal current largest
    increase count
print largest and how many times e appear */


import java.util.Scanner;

public class LargestAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int count = 0;

        while (true) {
            System.out.print("Enter integer (0 to stop): ");
            int num = scanner.nextInt();
            if (num == 0) break;

            if (num > largest) {
                largest = num;
                count = 0;
            } else if (num == largest) {
                count++;
            }
        }
        System.out.println("Largest: " + largest + ", Count: " + count);
    }
}
