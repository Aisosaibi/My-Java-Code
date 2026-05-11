/* 
Write a method that collects 10 integers, stores them in an array and returns the array
Write a method that takes an array and returns a new array with elements in reverse order
Write a method that takes an array and returns a new array with all even numbers removed (only odd numbers remain)
Write a method that takes an array and returns a new array with all odd numbers removed (only even numbers remain)
Write a method that takes an array and returns a new array with duplicate values removed (keep first occurrence only)
Write a method that takes an array and returns a new array sorted in ascending order
Modify TaskSix to sort in descending order 
Write a method that takes a sorted array and a target value, and returns the index of the target using linear search (return -1 if not found)
Write a method that takes two arrays and returns a new merged array containing all elements from both, sorted in ascending order
Write a method that takes an array and returns a new array where each element is replaced by the running total up to that index (prefix sum) e.g {1, 2, 3, 4} -> {1, 3, 6, 10} 
Write a method that takes an array and returns the second largest valuesWrite a method that takes an array and returns the second largest distinct value. Return -1 if no such value exsist
*/

import java.util.Scanner;

public class TaskOne{
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

//    public static void main(String[] args){
//        int[] array = storeInArray(10);
//        System.out.println(java.util.Arrays.toString(array));
//    }
}


//Explore below:
//import java.util.Scanner;
//
//public class TaskOne{
//    public static int[] storeInArray(int Scanner input){
//        int[] array = new int[input];
//        System.out.printf("Enter %d integers (separate by space): ", input);
//
//        for (int i = 0; i < input; i++){
//            int number = input.nextInt();
//            array[i] = number;
//        }
//
//        return array;
//    }
//    public static void main(String[] args){
//        int[] array = storeInArray(10);
//        System.out.println(java.util.Arrays.toString(array));
//    }
//}
