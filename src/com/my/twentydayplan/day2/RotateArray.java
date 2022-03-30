package com.my.twentydayplan.day2;

/**
 * @author luojiyuan
 * @description
 * @date 2022/03/30 22:37
 */
public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int flag = nums.length;
        int[] newArray = new int[flag];
        for(int i = 0; i < flag; i++){
            newArray[(i + k) % flag] = nums[i];
        }
        System.arraycopy(newArray, 0, nums, 0, flag);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        for(int i: nums){
            System.out.print(i);
        }
    }

}
