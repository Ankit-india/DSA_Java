package src.assignments.recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 5; // 0 1 1 2 3 5 8 13 21 34 55
        System.out.println(nthFibboNumber(n));
        printFiboSeries(n);
    }

    private static int nthFibboNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return nthFibboNumber(n - 1) + nthFibboNumber(n - 2);
    }

    private static void printFiboSeries(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(nthFibboNumber(i) + " ");
        }
    }
}
