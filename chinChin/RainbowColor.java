import java.util.Random;

public class RainbowColor {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(7) + 1;
        
//        System.out.println(number);
        if (number == 1) {
            System.out.println("Violet");
        } else if (number == 2) {
            System.out.println("Indigo");
        } else if (number == 3) {
            System.out.println("Blue");
        } else if (number == 4) {
            System.out.println("Green");
        } else if (number == 5) {
            System.out.println("Yellow");
        } else if (number == 6) {
            System.out.println("Orange");
        } else {
            System.out.println("Red");
        }
    }
}
