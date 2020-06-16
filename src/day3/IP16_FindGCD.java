package day3;

/*
GCD of two numbers is the largest number that divides both of them.
A simple way to find GCD is to factorize both numbers and multiply common factors.
 */
public class IP16_FindGCD {

    public static void main(String[] args) {

        int a = 10, b = 15, gcd;
        gcd = findGCD(a, b);
        System.out.println(gcd);
    }

    private static int findGCD(int a, int b) {

        if (a == 0)
            return b;

        return findGCD(b%a, a);
    }
}
