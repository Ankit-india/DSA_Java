package src.assignments.stacksAndQueue.stack;

import java.util.List;

class Result {
    // https://www.hackerrank.com/challenges/game-of-two-stacks/problem

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    // Write your code here
        
        int sum = 0;
        int st1 = 0;
        int st2 = 0;
        int ans = 0;
        for(Integer x: a) {
            if(sum + x > maxSum){
                break;
            }
            sum += x;
            st1++;
        }
        ans = st1;
        for(Integer x: b) {
            sum += x;
            st2++;
            while(sum > maxSum && st1 > 0) {
                sum -= a.get(st1 - 1);
                st1--;
            }
            if(sum <= maxSum) {
                ans = Math.max(ans, st1+st2);
            }
        }
        
        return ans;
    }
    
    

}