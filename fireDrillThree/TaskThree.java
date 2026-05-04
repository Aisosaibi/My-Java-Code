/* Print array in TaskOne horizontally */

//import java.util.Arrays;
import java.util.Scanner;

public class TaskThree{
    public static void main(String[] args){
//        Scanner userInput = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int number = userInput.nextInt();    

        int number = 10;
        int [] array = new int[number];

        for (int index = 0; index < number; index++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            int entries = scanner.nextInt();
            array[index] = entries;
        }    

        System.out.println();

        for (int index = 0; index < number; index++){
            System.out.print(array[index]);
        }

        System.out.println();
    }

}
