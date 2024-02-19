package src.assignments.stacksAndQueue.stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int largestRectangleArea(int[] heights) {
        int[] left = getNextSmallestArrayToLeft(heights);
        int[] right = getNextSmallestArrayToRight(heights);

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < heights.length; i++) {
            int temp = ((right[i] - left[i]) - 1) * heights[i];
            ans = Math.max(temp, ans);
        }

        return ans;
    }

    private int[] getNextSmallestArrayToLeft(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        Stack<Pair> stack = new Stack<Pair>();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                res[k++] = -1;
            } else if (!stack.isEmpty() && stack.peek().first < arr[i]) {
                res[k++] = stack.peek().second;
            } else if (!stack.isEmpty() && arr[i] <= stack.peek().first) {
                while (!stack.isEmpty() && arr[i] <= stack.peek().first) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    res[k++] = -1;
                } else {
                    res[k++] = stack.peek().second;
                }
            }
            stack.push(new Pair(arr[i], i));
        }
        return res;
    }

    private int[] getNextSmallestArrayToRight(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        Stack<Pair> stack = new Stack<Pair>();
        int k = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                res[k--] = n;
            } else if (!stack.isEmpty() && stack.peek().first < arr[i]) {
                res[k--] = stack.peek().second;
            } else if (!stack.isEmpty() && arr[i] <= stack.peek().first) {
                while (!stack.isEmpty() && arr[i] <= stack.peek().first) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    res[k--] = n;
                } else {
                    res[k--] = stack.peek().second;
                }
            }
            stack.push(new Pair(arr[i], i));
        }
        return res;
    }
}