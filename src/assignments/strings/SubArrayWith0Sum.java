package src.assignments.strings;//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class SubArrayWith0Sum {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

        //taking input using class Scanner
        Scanner scan = new Scanner(System.in);

        //taking total number of testcases
        int t = scan.nextInt();
        while (t > 0) {
            //taking total count of elements
            int n = scan.nextInt();

            //Declaring and Initializing an array of size n
            int arr[] = new int[n];

            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            t--;

            //calling the method findSum
            //and print "YES" or "NO" based on the result
            System.out.println(Solution.findsum(arr, n) == true ? "Yes" : "No");
        }
    }


// } Driver Code Ends


    class Solution {
        //Function to check whether there is a subarray present with 0-sum or not.
        static boolean findsum(int arr[], int n) {
            //Your code here
            Map<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum == 0) {
                    return true;
                }
                if (map.containsKey(sum)) {
                    return true;
                }

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return false;
        }
    }
}