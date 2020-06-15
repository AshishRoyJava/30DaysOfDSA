package day2;

/*
Pascal’s triangle is a triangular array of the binomial coefficients.
Write a function that takes an integer value n as input and prints first n lines of the Pascal’s triangle.
Following are the first 6 rows of Pascal’s Triangle.

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

 */

public class IP08_PascalTriangle {

    public static void main(String[] args) {
        int n = 6;
        printPascal(n);
    }

    private static void printPascal(int n) {
        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++) {
                System.out.print(binomialCoefficient(line, i) + " ");
            }
            System.out.println();
        }
    }

    private static int binomialCoefficient(int n, int k) {

        int res = 1;
        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
