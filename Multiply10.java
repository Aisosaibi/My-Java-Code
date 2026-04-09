public class Multiply10 {
    public static void main(String[] args) {
        int number = 0;
        int product = 0;

        while (number < 10) {
            // take first number and multiply it with next
            int nextNumber = number + 1;
            int multiple = product * nextNumber;
            // this value should be multiplied with the next one
            product = multiple;
        }
        System.out.println(multiple);
    }
}
