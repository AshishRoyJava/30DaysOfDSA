package day1;

/*
Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.

Input: arr[] = {2, -3, 4, -1, -2, 1, 5, -3}
Output: 7
 */
public class IP05_KadaneAlgorithm {

    public static void main(String[] args) {

        int[] arr = new int[]{2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArraySum(arr);
    }

    private static void maxSubArraySum(int[] arr) {

        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int value : arr) {
            maxEndingHere = maxEndingHere + value;
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        System.out.println(maxSoFar);
    }
}
