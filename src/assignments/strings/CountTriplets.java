package src.assignments.strings;//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class CountTriplets {
    // https://www.geeksforgeeks.org/problems/count-the-triplets4615/1
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

//            Solution ob = new Solution();
            System.out.println(Solution.countTriplet(arr, n));
        }
    }

// } Driver Code Ends


//User function Template for Java

    class Solution {
        static int countTriplet(int arr[], int n) {
            // code here
            Map<Integer, Integer> map = new HashMap<>();
            for (int x : arr) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = arr[i] + arr[j];
                    if (map.containsKey(sum)) {
                        ans++;
                    }
                }
            }
            return ans;
        }
    }
}