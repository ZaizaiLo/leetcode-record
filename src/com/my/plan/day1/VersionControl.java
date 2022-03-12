package com.my.plan.day1;

/**
 * @description
 * @author luojiyuan
 * @date 2022-03-10 21:59
 */

public class VersionControl {

    public int firstBadVersion(int n) {
        int left = 1;
        while (left < n) {
            int mid = left + (n - left) / 2;
            if (isBadVersion(mid)) {
                n = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int i) {
        return true;
    }

}
