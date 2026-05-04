/* Write a function that takes an array and output an array containing the elements in the even index*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskFour{
    public static int[] evenSubsetofArray(int[] array){
        int count = 0;

        for (int index = 0; index < array.length; index += 2){
                count++;
        }

        int[] subsetEven = new int[count];

        int number = 0;

        for (int index = 0; index < array.length; index += 2){
                subsetEven[number] = array[index];
                number++;
        }

        return subsetEven;
    }


    public static void main(String[] args){
        int[] newArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(evenSubsetofArray(newArray)));
    }
}
