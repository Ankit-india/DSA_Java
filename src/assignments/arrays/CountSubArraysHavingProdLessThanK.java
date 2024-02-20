package src.assignments.arrays;//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class CountSubArraysHavingProdLessThanK {
    // https://www.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());

            long a[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            out.println(countSubArrayProductLessThanK(a, n, k));
        }
        out.close();
    }

    public static long countSubArrayProductLessThanK(long a[], int n, long k) {
        long count = 0;

        int left = 0;
        int right = 0;
        long prod = 1l;
        while (left < n) {
            prod *= a[left];
            while (right <= left && prod >= k) {
                prod /= a[right];
                right++;
            }
            count += (left - right + 1);
            left++;
        }
        return count;
    }

}