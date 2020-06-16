package day3;

/*
Given two integers x and n, write a function to compute x^n.
We may assume that x and n are small and overflow doesn’t happen.

Calculate in O(logn)

Input : x = 2, n = 3
Output : 8

Input : x = 7, n = 2
Output : 49
 */
public class IP14_Find_xPower_n {

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        
        int result = power(x, n);
        System.out.println(result);
    }

    private static int power(int x, int n) {

        int temp;
        if(n == 0) {
            return 1;
        }
        temp = power(x, n/2);
        if (n%2 == 0) {
            return temp*temp;
        } else {
            return x*temp*temp;
        }
    }
}
