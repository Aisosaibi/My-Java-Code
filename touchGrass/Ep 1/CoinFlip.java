/* create counter for heads and tails
repeat 1,000,000 times
    generate random number, either 0 or 1
    if e be 0, add to heads count
    otherwise add to tails count
print total heads and total tails */

public class CoinFlip {
    public static void main(String[] args) {
        int heads = 0, tails = 0;

        for (int i = 0; i < 1000000; i++) {
            if (Math.random() < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println("Total: " + heads + tails);
    }
}
