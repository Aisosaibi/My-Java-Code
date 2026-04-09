//public class CountDown {
//    public static void main(String[] args) {
//        int count = 5;
//        while (count > 0) {
//            System.out.println(count); 
//            count = count-1;
//        }
//        System.out.println("Happy New Year!");
//    }
//}
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int count = input.nextInt();

        for (; count <= 10 ; count++){
            System.out.println(count);
        }
        System.out.print("Go!\n");
    }
}


