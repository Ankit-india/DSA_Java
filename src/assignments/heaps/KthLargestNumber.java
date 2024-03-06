package src.assignments.heaps;//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class KthLargestNumber {
    // https://www.geeksforgeeks.org/problems/k-largest-elements4206/1

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().kLargest(arr, n, k);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < n; i++) {
            pq.add(arr[i]);
            if(pq.size() > k) {
                pq.remove();
            }
        }
        int i = 0;
        int[] ans = new int[pq.size()];
        while(!pq.isEmpty()) {
            ans[i++] = pq.remove();
        }
        reverse(ans);
        return ans;
    }
    private void reverse(int[] ans) {
        int i = 0;
        int j = ans.length - 1;
        while(i < j) {
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
    }
}