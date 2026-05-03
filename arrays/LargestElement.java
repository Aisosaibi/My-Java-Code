import java.util.Scanner;

public class LargestElement{

    public static int largestElement(int size){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter %d numbers: ", size);
        int[] list =  new int[size];

        for (int i = 0; i < size; i++)
            list[i] = input.nextInt();

        int largest = list[0];
        for (int i = 1; i < size; i++){
            if (list[i] > largest)
                largest = list[i];
        }

        return largest;
    
    }

    public static void main(String[] args){
        int result = largestElement(5);
        System.out.println("Largest element is: " + result);
    }

}
