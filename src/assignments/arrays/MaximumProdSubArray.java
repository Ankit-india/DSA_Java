package src.assignments.arrays;

class MaximumProdSubArray {
    // https://leetcode.com/problems/maximum-product-subarray/
    public int maxProduct(int[] nums) {
        int preProd = 1;
        int sufProd = 1;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(preProd == 0) {
                preProd = 1;
            }
            if(sufProd == 0) {
                sufProd = 1;
            }

            preProd *= nums[i];
            sufProd *= nums[nums.length - i - 1];

            ans = Math.max(ans, Math.max(preProd, sufProd));
        }
        return ans;
    }
}