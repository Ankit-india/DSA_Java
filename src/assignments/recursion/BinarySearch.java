package src.assignments.recursion;

class BinarySearch {
    // https://leetcode.com/problems/binary-search/
    public int search(int[] nums, int target) {
        return bs_rec(nums, target, 0, nums.length-1);
    }

    private int bs_rec(int[] nums, int target, int start, int end) {
        if(start > end) { 
            return -1;
        }
        int mid = start + (end - start) / nums.length;
        if(nums[mid] == target) {
            return mid;
        }
        if(nums[mid] < target) {
            return bs_rec(nums, target, mid + 1, end);
        }
        else {
            return bs_rec(nums, target, start, mid-1);
        }
    }
}