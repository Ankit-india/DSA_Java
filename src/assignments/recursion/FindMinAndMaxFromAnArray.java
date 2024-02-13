package src.assignments.recursion;

import java.util.Scanner;

public class FindMinAndMaxFromAnArray {

    // https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Minimum number is : " + findMinUsingRec(arr, n));
        System.out.println("The Maximum number is : " + findMaxUsingRec(arr, n));
    }

    private static int findMinUsingRec(int[] arr, int n) {
        if(n == 1) {
            return arr[0];
        }
        return Math.min(arr[n-1], findMinUsingRec(arr, n-1));
    }

    private static int findMaxUsingRec(int[] arr, int n) {
        if(n == 1) {
            return arr[0];
        }
        return Math.max(arr[n-1], findMaxUsingRec(arr, n-1));
    }
}
