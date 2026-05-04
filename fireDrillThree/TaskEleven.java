/* Output the maximum of TaskFive */

import java.util.Arrays;
import java.util.Scanner;

public class TaskEleven{
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


    public static int maximumOfSubset(int[] oddSubsetofArray){

        int maximum = 0;

        for (int index = 0; index < oddSubsetofArray.length; index++){
            maximum = oddSubsetofArray[0];
            if (maximum < oddSubsetofArray[index])
                maximum = oddSubsetofArray[index];
        }
        
        return maximum;
    }


    public static void main(String[] args){
        int[] newArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("\n" + Arrays.toString(oddSubsetofArray(newArray)));
        System.out.println(sumOddSubset(oddSubsetofArray(newArray)));
        System.out.println(maximumOfSubset(oddSubsetofArray(newArray)));
    }
}
