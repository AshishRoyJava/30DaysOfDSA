package day2;

/*
Inversion Count for an array indicates – how far (or close) the array is from being sorted.
If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

Input: arr[] = {8, 4, 2, 1}
Output: 6

Explanation: Given array has six inversions:
(8,4), (4,2),(8,2), (8,1), (4,1), (2,1).

 */

public class IP10_InversionCount {

    public static void main(String[] args) {

        int[] arr = new int[]{ 1, 20, 6, 4, 5 };

        printInversionCount(arr);
    }

    private static void printInversionCount(int[] arr) {

        int invCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        System.out.println(invCount);
    }
}
