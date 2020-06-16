package day3;

/*
Given an integer n, write a function that returns count of trailing zeroes in n!.

Input: n = 5
Output: 1
Factorial of 5 is 120 which has one trailing 0.

Input: n = 20
Output: 4
Factorial of 20 is 2432902008176640000 which has
4 trailing zeroes.

Input: n = 100
Output: 24

** Trailing 0s in n! = Count of 5s in prime factors of n!
                  = floor(n/5) + floor(n/25) + floor(n/125) + .... **
 */
public class IP15_CountTrailingZeroesInFactorial {

    public static void main(String[] args) {
        
        int num = 100;
        
        countTrailingZeroes(num);
    }

    private static void countTrailingZeroes(int num) {

        int count = 0;

        for (int i = 5; num / i >= 1; i *= 5) {
            count += num / i;
        }
        System.out.println(count);
    }
}
