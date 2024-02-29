package src.leetcodeContests;

public class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        
        for (int i = 0; i < bottomLeft.length; i++) {
            minX = Math.min(minX, bottomLeft[i][0]);
            minY = Math.min(minY, bottomLeft[i][1]);
            maxX = Math.max(maxX, topRight[i][0]);
            maxY = Math.max(maxY, topRight[i][1]);
        }
        
        int maxSideLength = Math.min(maxX - minX, maxY - minY);
        long maxSquareArea = 0;
        
        for (int sideLength = maxSideLength; sideLength >= 1; sideLength--) {
            long squareArea = (long) sideLength * sideLength;
            
            // Check if it's possible to fit a square of this side length in the intersection
            if (canFitSquare(bottomLeft, topRight, minX, minY, sideLength)) {
                maxSquareArea = Math.max(maxSquareArea, squareArea);
                break; // Found the largest square, no need to continue iterating
            }
        }
        
        return maxSquareArea;
    }
    
    // Helper method to check if it's possible to fit a square of given side length in the intersection
    private boolean canFitSquare(int[][] bottomLeft, int[][] topRight, int minX, int minY, int sideLength) {
        for (int i = 0; i < bottomLeft.length; i++) {
            int blX = bottomLeft[i][0];
            int blY = bottomLeft[i][1];
            int trX = topRight[i][0];
            int trY = topRight[i][1];
            
            // Check if the intersection area of this rectangle can fit a square of given side length
            int intersectX = Math.min(trX, minX + sideLength);
            int intersectY = Math.min(trY, minY + sideLength);
            
            // If the intersection's width and height are greater than or equal to the side length, return true
            if (intersectX - blX >= sideLength && intersectY - blY >= sideLength) {
                return true;
            }
        }
        return false;
    }
}
