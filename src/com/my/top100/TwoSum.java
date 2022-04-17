package com.my.top100;

/**
 * @description
 * @author luojiyuan
 * @date 2022-03-24 22:19
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
