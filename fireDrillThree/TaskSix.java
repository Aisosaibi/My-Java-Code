/* Write a function that takes the output of TaskFour and returns the Sum */

import java.util.Arrays;
import java.util.Scanner;

public class TaskSix{
    public static int[] evenSubsetofArray(int[] array){
        int count = 0;

        for (int index = 0; index < array.length; index += 2){
                count++;
        }

        int[] subsetEven = new int[count];

        int number = 0;

        for (int index = 0; index < array.length; index++){
                subsetEven[number] = array[index];
                number++;
        }

        return subsetEven;
    }


    public static int sumEvenSubset(int[] evenSubsetofArray){
        int sum = 0;

        for (int index = 0; index < evenSubsetofArray.length; index++){
            sum += evenSubsetofArray[index];
        }
        
        return sum;
    }


    public static void main(String[] args){
        int[] newArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("\n" + Arrays.toString(evenSubsetofArray(newArray)));
        System.out.println(sumEvenSubset(evenSubsetofArray(newArray)));
    }
}
