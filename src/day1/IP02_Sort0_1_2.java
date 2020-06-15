package day1;

/*
Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array.
The functions should put all 0s first, then all 1s and all 2s in last.

Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

** Dutch National Flag Algorithm **
 */
public class IP02_Sort0_1_2 {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void sort012(int[] arr) {

        int low = 0;
        int high = arr.length - 1;
        int mid = 0, temp = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
