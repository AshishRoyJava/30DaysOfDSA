package day3;

/*
A robot is located at the top-left corner of a m x n grid.
The robot can only move either down or right at any point in time.
The robot is trying to reach the bottom-right corner of the grid.
How many possible unique paths are there?

Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right
 */
public class IP17_UniquePaths {

    public static void main(String[] args) {

        int m = 3;
        int n = 2;
        int paths = uniquePaths(m, n);
        System.out.println(paths);
    }

    private static int uniquePaths(int m, int n) {
        int[] ways = new int[n];
        for(int j=0; j<n; j++)  ways[j] = 1;

        for(int i=1; i<m; i++) {
            ways[0] = 1;
            for(int j=1; j<n; j++) {
                ways[j] = ways[j-1] + ways[j];
            }
        }
        return ways[n-1];
    }
}
