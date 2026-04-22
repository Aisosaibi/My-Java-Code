/* create line counter
loop from 2 to 1200
    for each number, check if e be prime:
        loop from 2 to square root of number
        if any number fit divide am, e no be prime
    if na prime, print am, increase line counter
    if line counter reach 8, print new line, reset counter */

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 2; num <= 1200; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
                if (count % 8 == 0) System.out.println();
            }
        }
    }
}
