package src.assignments.heaps;//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class MergeKSortedArrays{
	// https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1?page=1
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();

			ArrayList<Integer> arr= MergeKArrays.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}


// } Driver Code Ends


//User function Template for Java


class MergeKArrays
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i < K; i++) {
            for(int j = 0; j < K; j++) {
                q.add(arr[i][j]);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()) {
            ans.add(q.remove());
        }
        return ans;
        
    }
}