import java.util.Scanner;

public class TaskTwo{
    public static int[] storeInArray(int size){
        Scanner input = new Scanner(System.in);
        int[] array = new int[size];
        System.out.printf("Enter %d integers (separate by space): ", size);

        for (int i = 0; i < size; i++){
            int number = input.nextInt();
            array[i] = number;
        }

        return array;
    }

    public static int[] reverseArray(int[] array){
        int[] newArray = array;
        int left = 0;
        int right = newArray.length - left - 1;

        while (left < right){
            int temp = newArray[left];
            newArray[left] = newArray[right];
            newArray[right] = temp;

            left++;
            right--;
        }

        return newArray;
    }


    public static void main(String[] args){
        int[] array = {1, 2, 3, 4};
        int [] testArray = reverseArray(array);
        System.out.println(java.util.Arrays.toString(testArray));
    }
}
