/* Write a function that takes an array and output an array containing the elements in the odd index */

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive{
    public static int[] oddSubsetofArray(int[] array){
        int count = 0;

        for (int index = 0; index < array.length; index++){
            if (index % 2 == 1)
                count++;
        }

        int[] subsetOdd = new int[count];

        int number = 0;

        for (int index = 0; index < array.length; index++){
            if (index % 2 == 1){
                subsetOdd[number] = array[index];
                number++;}
        }

        return subsetOdd;
    }


    public static void main(String[] args){
        int[] newArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(oddSubsetofArray(newArray)));
    }
}
