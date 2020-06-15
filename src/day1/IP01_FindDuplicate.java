package day1;

/*
Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times.
Find these repeating numbers in O(n) and using only constant memory space.

Input : n = 7 and array[] = {1, 2, 3, 1, 3, 6, 6}
Output: 1, 3, 6

Explanation: The numbers 1 , 3 and 6 appears more
than once in the array.

Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
Output: 3

Explanation: The number 3 appears more than once
in the array.
 */

public class IP01_FindDuplicate {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 3, 6, 6};

        findDuplicate(arr);
    }

    private static void findDuplicate(int[] arr) {

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }
}
