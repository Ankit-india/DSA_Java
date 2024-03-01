package src.assignments.strings;//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class RemoveDuplicatesElement {
    // https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++)
                a[i] = sc.nextInt();

//            Solution g = new Solution();
            int n = Solution.remove_duplicate(a, N);

            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
            T--;
        }
    }

// } Driver Code Ends

//User function Template for Java

    class Solution {
        static int remove_duplicate(int arr[], int N) {
            // code here
            int i = 0;
            int j = 0;
            while (j < N) {
                if (arr[i] != arr[j]) {
                    if (j - i + 1 > 2) {
                        arr[i + 1] = arr[j];
                    }
                    i++;
                }
                j++;
            }
            return i + 1;
        }
    }
}