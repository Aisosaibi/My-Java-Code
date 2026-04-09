public class PrintSquares1to10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            System.out.printf("%.1f%n", Math.pow(i, 2));
    }
}
