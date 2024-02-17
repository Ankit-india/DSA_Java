package src.assignments.sorting;

class LargestNumber {
    // https://leetcode.com/problems/largest-number/
    public String largestNumber(int[] nums) {
        sort(nums, 0, nums.length - 1);
        
        StringBuilder ans= new StringBuilder();
        for(int x:nums){
            ans.append(Integer.toString(x));
        }
        return nums[0] == 0 ? "0" : ans.toString();
    }
    private void sort(int[] nums, int start, int end) {
        if(end == start) {
            return;
        }

        int mid = start + (end - start) / 2;

        sort(nums, start, mid);
        sort(nums, mid+1, end);

        merge(nums, start, mid, end);
    }
    private void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end) {
            long n = 10, m = 10;
            while(nums[i] >= n) n *= 10;
            while(nums[j] >= m) m *= 10;

            long l = nums[i] * m + nums[j];
            long h = nums[j] * n + nums[i];
            if(l > h) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }
        while(i <= mid) {
            temp[k++] = nums[i++];
        }
        while(j <= end){
            temp[k++] = nums[j++];
        }
        k = 0;
        i = start;
        while(i <= end){
            nums[i++] = temp[k++];
        }
    }
}