package src.assignments.recursion;

import java.util.Scanner;

public class FirstUpperCaseLetterInGivenStringRecursiveAndIterative {
    // https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getFirstUpperCaseLetter(str, 1));
        System.out.println(getLastUpperCaseLetter(str, 1));
    }

    private static Character getFirstUpperCaseLetter(String str, int n) {
        if (n == str.length() - 1) {
            return (str.charAt(n - 1) >= 'A' && str.charAt(n - 1) <= 'Z') ? str.charAt(n-1) : '0';
        }

        return (str.charAt(n - 1) >= 'A' && str.charAt(n - 1) <= 'Z') ? str.charAt(n - 1) : getFirstUpperCaseLetter(str, n + 1);
    }
    private static Character getLastUpperCaseLetter(String str, int n) {
        if (n == 1) {
            return (str.charAt(n - 1) >= 'A' && str.charAt(n - 1) <= 'Z') ? str.charAt(0) : '0';
        }

        return (str.charAt(n - 1) >= 'A' && str.charAt(n - 1) <= 'Z') ? str.charAt(n - 1) : getLastUpperCaseLetter(str, n - 1);
    }
}
