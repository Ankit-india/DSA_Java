package src.assignments.strings;//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++)
                a[i] = sc.nextInt();


//            Solution g = new Solution();
            int n = Solution.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }


// } Driver Code Ends

    class Solution {

        // arr[] : the input array containing 0s and 1s
        // N : size of the input array

        // return the maximum length of the subarray
        // with equal 0s and 1s
        static int maxLen(int[] arr, int N) {
            // Your code here
            int ans = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] == 0) {
                    arr[i] = -1;
                }
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 1; i < N; i++) {
                arr[i] += arr[i - 1];
            }
            for (int i = 0; i < N; i++) {
                if (map.containsKey(arr[i])) {
                    ans = Math.max(ans, i - map.get(arr[i]));
                }
                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], i);
                }
            }
            return ans;
        }
    }
}
