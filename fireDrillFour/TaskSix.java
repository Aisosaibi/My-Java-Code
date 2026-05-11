import java.util.Scanner;

public class TaskSix{
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

    public static int[] onlyOdd(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                continue;
            }
            else count++;
        }

        int[] onlyOdd = new int[count];

        int uniqueIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                onlyOdd[uniqueIndex] = array[i];
                uniqueIndex++;
                }
            }

        return onlyOdd;
    }

    public static int[] onlyEven(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                continue;
            }
            else count++;
        }

        int[] onlyEven = new int[count];

        int uniqueIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                onlyEven[uniqueIndex] = array[i];
                uniqueIndex++;
                }
            }

        return onlyEven;
    }

    public static int[] unique(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean seenBefore = false;
            for (int j = 0; j < i; j++) { 
                if (array[j] == array[i]) {
                    seenBefore = true;
                    break;
                }
            }
            if (!seenBefore) count++;
        }

        int[] unique = new int[count];
        int uniqueIndex = 0;
        for (int i = 0; i < array.length; i++) {
            boolean seenBefore = false;
            for (int j = 0; j < i; j++) {   
                if (array[j] == array[i]) {
                    seenBefore = true;
                    break;
                }
            }
            if (!seenBefore) {
                unique[uniqueIndex] = array[i];
                uniqueIndex++;
            }
        }

        return unique;
    }


    public static int[] ascending(int[] array){
        int[] newArray = array;
        int left = 0;
        int right = left + 1;

        for (int i = 1; i < newArray.length; i++){
        while (newArray[i-1] < newArray[i]){
            if (right < array.length){

                if (newArray[left] > newArray[right]){
                    int temp = newArray[left];
                    newArray[left] = newArray[right];
                    newArray[right] = temp;
                    left++;
                    right++;
                }

                else continue;
            }
        }
        }

        return newArray;
    }
        


    public static void main(String[] args){
//        int[] array = {3, 2, 1, 1};
        int[] array = {2, 1, 1, 3};
        int [] testArray = ascending(array);
        System.out.println(java.util.Arrays.toString(testArray));
    }
    
    
}
