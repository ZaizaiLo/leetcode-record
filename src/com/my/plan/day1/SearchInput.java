package com.my.plan.day1;

/**
 * @description
 * @author luojiyuan
 * @date 2022-03-12 11:55
 */
public class SearchInput {


    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        int ans = n;
        while (left <= right) {
            int mid = ((right - left) / 2) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }

}
