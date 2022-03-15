package com.my.twentydayplan.day2;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @description 有序数的平方
 * @author luojiyuan
 * @date 2022-03-12 12:28
 */
public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        IntStream sorted = Arrays.stream(nums).sorted();
        return sorted.map(item -> {
            item = item * item;
            return item;
        }).sorted().toArray();
    }
}
