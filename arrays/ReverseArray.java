import java.util.Scanner;

public class ReverseArray{

    public static int ReverseArray(int size){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter %d numbers: ", size);
        int[] list =  new int[size];
        int[] reverseList = new int[size];

        for (int index = 0; index < size; index++){
            list[index] = input.nextInt();
        }

        System.out.print("Elements in list: ");

        for (int index = 0; index < size; index++){
            int element = list[index];
            System.out.print(element);
        }

        System.out.println();

        for (int index = 0; index < size; i++){
            int element = list[index - 1];
            reverseList[index] = element;
        }

        return reverseList;
    
    }

    public static void main(String[] args){
        int result = ReverseArray(5);
        System.out.println("Elements in inverted list is: " + result);
    }

}
