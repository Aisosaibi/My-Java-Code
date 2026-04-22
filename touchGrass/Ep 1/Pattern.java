/* first loop: go from 7 down to 1, print each number
second loop: go from 2 up to 7, print each numbers */

public class Pattern {
    public static void main(String[] args) {
        for (int i = 7; i >= 1; i--) {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
