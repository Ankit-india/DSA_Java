package src.assignments.arrays;

import java.util.HashMap;
import java.util.Map;

class SubArraySumEqualsK {
    // https://leetcode.com/problems/subarray-sum-equals-k/
    public int subarraySum(int[] nums, int k) {
        int subArrayCount = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                subArrayCount += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return subArrayCount;
        // int subArrayCount = 0;
        // int n = nums.length;
        // int sum = 0;

        // for (int i = 0; i < n; i++) {
        //     sum = 0; 
        //     for (int j = i; j < n; j++) {
        //         sum += nums[j];
        //         if (sum == k)
        //             subArrayCount++;
        //     }
        // }
        // return subArrayCount;
    }
}
