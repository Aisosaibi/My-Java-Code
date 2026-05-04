/* Output the minimum of TaskFive */

import java.util.Arrays;
import java.util.Scanner;

public class TaskNine{
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


    public static int sumOddSubset(int[] oddSubsetofArray){
        int sum = 0;

        for (int index = 0; index < oddSubsetofArray.length; index++){
            sum += oddSubsetofArray[index];
        }
        
        return sum;
    }


    public static int minimumOfSubset(int[] oddSubsetofArray){

        int minimum = 0;

        for (int index = 0; index < oddSubsetofArray.length; index++){
            minimum = oddSubsetofArray[0];
            if (minimum > oddSubsetofArray[index])
                minimum = oddSubsetofArray[index];
        }
        
        return minimum;
    }


    public static void main(String[] args){
        int[] newArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("\n" + Arrays.toString(oddSubsetofArray(newArray)));
        System.out.println(sumOddSubset(oddSubsetofArray(newArray)));
        System.out.println(minimumOfSubset(oddSubsetofArray(newArray)));
    }
}
