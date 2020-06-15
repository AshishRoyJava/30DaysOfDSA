package day1;

/*
We are given two sorted array. We need to merge these two arrays such that the initial numbers (after complete sorting)
are in the first array and the remaining numbers are in the second array. Extra space allowed in O(1)

Input: ar1[] = {10};
       ar2[] = {2, 3};
Output: ar1[] = {2}
        ar2[] = {3, 10}

Input: ar1[] = {1, 5, 9, 10, 15, 20};
       ar2[] = {2, 3, 8, 13};
Output: ar1[] = {1, 2, 3, 5, 8, 9}
        ar2[] = {10, 13, 15, 20}
 */

public class IP04_MergeSortedArrays {

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
        int arr2[] = new int[]{2, 3, 8, 13};

        mergeSortedArrays(arr1, arr2);

        System.out.println("First Array :");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Second Array :");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSortedArrays(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;
        for (int i=n-1; i>=0; i--)
        {
            int j, last = arr1[m-1];
            for (j=m-2; j >= 0 && arr1[j] > arr2[i]; j--)
                arr1[j+1] = arr1[j];
            if (j != m-2 || last > arr2[i])
            {
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
    }
}
