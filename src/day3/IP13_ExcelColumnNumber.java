package day3;

/*
Given a column title as appears in an Excel sheet, return its corresponding column number.
column  column number
  A  ->  1
  B  ->  2
  C  ->  3
  ...
  Z  ->  26
  AA ->  27
  AB ->  28

Input: A
Output: 1

Input: AA
Output: 27
 */
public class IP13_ExcelColumnNumber {

    public static void main(String[] args) {

        String column = "CDA";
        printColumnNumber(column);
    }

    private static void printColumnNumber(String column) {
        int result = 0;
        for (int i = 0; i < column.length(); i++)
        {
            result *= 26;
            result += column.charAt(i) - 'A' + 1;
        }
        System.out.println(result);
    }
}
