package src.assignments.strings;//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class FindIndexesOfSubArrayWithGivenSum {
    // https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int i = 0;
        int j = 0;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(j < n) {
            sum += arr[j];
            if(sum == s) {
                ans.add(i + 1);
                ans.add(j + 1);
                break;
            }
            else if(sum > s) {
                while(i < j && sum > s) {
                    sum -= arr[i];
                    i++;
                }
                if(sum == s) {
                    ans.add(i + 1);
                    ans.add(j + 1);
                    break;
                }
            }
            j++;
        }
        if(ans.size() != 2) {
            ans.add(-1);
        }
        return ans;
    }
}