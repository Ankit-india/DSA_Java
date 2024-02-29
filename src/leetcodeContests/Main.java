package src.leetcodeContests;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] bottomLeft = {{1, 1}, {2, 2}, {3, 1}};
        int[][] topRight = {{3, 3}, {4, 4}, {6, 6}};

        Solution solution = new Solution();
        long largestArea = solution.largestSquareArea(bottomLeft, topRight);

        System.out.println("Largest square area: " + largestArea);
    }
}
