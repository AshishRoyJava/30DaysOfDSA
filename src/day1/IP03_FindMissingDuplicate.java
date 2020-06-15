package day1;

/*
Given an unsorted array of size n. Array elements are in the range from 1 to n.
One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array,
2 is missing and 3 occurs twice

Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1

 */
public class IP03_FindMissingDuplicate {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 6, 2, 1, 1};
        findMissingDuplicate(arr);
    }

    private static void findMissingDuplicate(int[] arr) {
        System.out.print("The repeating element is ");

        for (int i = 0; i < arr.length; i++) {
            int absVal = Math.abs(arr[i]);
            if (arr[absVal - 1] > 0)
                arr[absVal - 1] = -arr[absVal - 1];
            else
                System.out.println(absVal);
        }

        System.out.print("And the missing element is ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }
}
