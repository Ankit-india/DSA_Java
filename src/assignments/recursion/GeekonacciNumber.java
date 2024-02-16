package src.assignments.recursion;/*package whatever //do not write package name here */

import java.util.Scanner;

class GeekonacciNumber {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int n = sc.nextInt();
		    solve(n, a, b, c);
		    t--;
		}
	}
	
	private static void solve(int n, int a, int b, int c) {
	    System.out.println(geekonacciNumber(n, a, b, c));
	}
	
	private static int geekonacciNumber(int n, int a, int b, int c) {
	    if(n == 1) {
	        return a;
	    }
		if(n == 2) {
			return b;
		}
		if(n == 3) {
			return c;
		}
	    
	    int sum = a + b + c;
	    a = b;
	    b = c;
	    c = sum;
	    return geekonacciNumber(n - 1, a, b, c);
	}
}