public class Multiply1to10 {
    public static void main(String[] args) {
        int number = 1;
        int multiple = 1;

        while (number <= 10) {
            multiple = multiple * number;
            number++; }

        System.out.println(multiple);
    }
}
