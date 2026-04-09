public class PrintIsDivisibleBy3 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 30) {
          if (number % 3 == 0)
                System.out.println(number);
          number++;
        }
    }
}
